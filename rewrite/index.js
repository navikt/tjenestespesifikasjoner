const fs = require('fs');
const glob = require('glob');
const xml2js = require('xml2js');

const poms = glob.sync('**/*/pom.xml').filter(name => name.indexOf('rewrite') === -1);
const modules = Array.from(new Set(poms.map(file => {
    return file.substr(0, file.indexOf('/'));
})));

const version = '0-SNAPSHOT';

const parent = {
    groupId: 'no.nav.tjenestespesifikasjoner',
    artifactId: 'tjenestespesifikasjoner',
    version
};

const builder = new xml2js.Builder({
    rootName: 'project',
    headless: true,
    renderOpts: {
        pretty: true,
        newline: '\n',
        indent: '    '
    }
});

const licenses = {
    license: {
        name: 'MIT License',
        url: 'https://opensource.org/licenses/MIT'
    }
};

const developers = {
    developer: {
        organization: 'NAV (Arbeids- og velferdsdirektoratet) - The Norwegian Labour and Welfare Administration',
        organizationUrl: 'https://www.nav.no'
    }
};

const distributionManagement = {
    snapshotRepository: {
        id: 'ossrh',
        url: 'https://oss.sonatype.org/content/repositories/snapshots'
    },
    repository: {
        id: 'ossrh',
        url: 'https://oss.sonatype.org/service/local/staging/deploy/maven2/'
    }
};

function makeRootPom() {
    const xml = builder.buildObject({
        modelVersion: '4.0.0',
        ...parent,
        name: 'tjenestespesifikasjoner',
        packaging: 'pom',
        properties: {
            'maven.compiler.source': '1.8',
            'maven.compiler.target': '1.8',
            'project.build.sourceEncoding': 'UTF-8',
            'cxf.version': '3.1.6',
            'cxf-xjc-boolean.version': '3.1.0'
        },
        licenses,
        developers,
        distributionManagement,
        modules: {
            module: modules
        },
        dependencyManagement: {
            dependencies: {
                dependency: [{
                    groupId: 'no.nav.tjenestespesifikasjoner',
                    artifactId: 'jaxb-adapters',
                    version
                }, {
                    groupId: 'joda-time',
                    artifactId: 'joda-time',
                    version: '2.10'
                }]
            }
        },
        build: {
            pluginManagement: {
                plugins: {
                    plugin: [{
                        groupId: 'org.apache.maven.plugins',
                        artifactId: 'maven-source-plugin',
                        version: '3.0.1'
                    }, {
                        groupId: 'org.apache.maven.plugins',
                        artifactId: 'maven-resources-plugin',
                        version: '3.1.0'
                    }, {
                        groupId: 'org.apache.maven.plugins',
                        artifactId: 'maven-javadoc-plugin',
                        version: '3.0.1'
                    }]
                }
            }
        },
        profiles: {
            profile: {
                id: 'release',
                build: {
                    plugins: {
                        plugin: [{
                            groupId: 'org.apache.maven.plugins',
                            artifactId: 'maven-gpg-plugin',
                            version: '1.6',
                            executions: {
                                execution: {
                                    id: 'sign-artifacts',
                                    phase: 'verify',
                                    goals: {
                                        goal: 'sign'
                                    }
                                }
                            }
                        }]
                    }
                }
            }
        }
    });

    fs.writeFileSync('pom.xml', xml);
}

makeRootPom();

function fixJaxbVersion(dep) {
    if (dep.artifactId[0] === 'jaxb-adapters') {
        return {
            ...dep,
            version
        };
    } else {
        return dep;
    }
}

poms.forEach(file => {
    xml2js.parseString(fs.readFileSync(file, 'utf-8'), (err, res) => {
        if (err) {
            console.error('Could not parse file', file, err);
        }
        res.project.parent = parent;
        res.project.version = version;
        res.project.name = '${project.artifactId}';


        [
            'henvendelse-arkivering-tjenestespesifikasjon',
            'dokumentinnsending-tjenestespesifikasjon',
            'henvendelse-arkivering-tjenestespesifikasjon',
            'henvendelse-tjenestespesifikasjon'
        ].forEach(name => {
            if (file.indexOf(name + '/') === 0 &&
                file !== name + '/pom.xml'
            ) {
                res.project.parent = {
                    ...parent,
                    artifactId: name
                };
            }
        });

        /*
        console.log(file);
        process.exit(1);
        */

        /*
        res.project.description = 'Tjenestespesifikasjoner';
        res.project.url = 'https://github.com/navikt/tjenestespesifikasjoner';
        res.project.licenses = licenses;
        res.project.developers = developers;
        res.project.distributionManagement = distributionManagement;
        */

        delete res.project.groupId;

        const build = res.project.build ? res.project.build[0] : null;

        if (build && build.plugins) {
            delete build.resources;
            delete build.pluginManagement;
            res.project.build = {
                ...build,
                plugins: {
                    plugin: [...build.plugins[0].plugin.map(plugin => {
                        if (plugin.dependencies) {
                            return {
                                ...plugin,
                                dependencies: {
                                    dependency: plugin.dependencies[0].dependency.map(fixJaxbVersion)
                                }
                            }
                        } else {
                            return plugin;
                        }
                    }).filter(plugin => {
                        const artifactId = plugin.artifactId[0];
                        return [
                            'maven-assembly-plugin',
                            'maven-compiler-plugin',
                            'maven-release-plugin',
                            'maven-javadoc-plugin'
                        ].indexOf(artifactId) === -1;
                    }), {
                        /*
                        <version>3.0.1</version>
                <executions>
                    <execution>
                        <id>attach-javadocs</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>jar</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <sourceFileIncludes>
                        <sourceFileInclude>target/generated-sources/**.java</sourceFileInclude>
                    </sourceFileIncludes>
                    </configuration>
                        * */
                        groupId: 'org.apache.maven.plugins',
                        artifactId: 'maven-javadoc-plugin',
                        executions: {
                            execution: {
                                id: 'attach-javadocs',
                                phase: 'verify',
                                goals: {
                                    goal: 'jar'
                                }
                            }
                        },
                        configuration: {
                            doclint: 'none',
                            quiet: 'true'
                        }
                    }]
                },
                resources: {
                    /*
                    * <resources>
            <resource>
                <directory>src/main/resources</directory>
            </resource>
            <resource>
                <directory>${wsdl.directory}</directory>
                <targetPath>${project.artifactId}/wsdl</targetPath>
            </resource>
        </resources>
        */
                    resource: [{
                        directory: 'src/main/resources'
                    }, {
                        directory: '${wsdl.directory}',
                        targetPath: '${project.artifactId}/wsdl'
                    }]
                }
            };
        }

        if (res.project.dependencies && res.project.dependencies[0].dependency) {
            console.log(res.project.dependencies[0].dependency);
            res.project.dependencies[0].dependency = res.project.dependencies[0].dependency.map(fixJaxbVersion);
        }


        res.project.scm = {
            developerConnection: 'scm:git:git@github.com:navikt/tjenestespesifikasjoner.git',
            connection: 'scm:git:git@github.com:navikt/tjenestespesifikasjoner.git',
            url: 'https://github.com/navikt/tjenestespesifikasjoner',
            tag: 'HEAD'
        };



        // res.project.dependencies.dependency = res.project.dependencies.dependency.map(fixJaxbVersion);

        const xml = builder.buildObject(res.project);
        fs.writeFileSync(file, xml);
    });
})