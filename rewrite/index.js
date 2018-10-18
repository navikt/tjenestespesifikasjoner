const fs = require('fs');
const glob = require('glob');
const xml2js = require('xml2js');

const poms = glob.sync('**/*/pom.xml').filter(name => name.indexOf('rewrite') === -1);
const modules = Array.from(new Set(poms.map(file => {
    return file.substr(0, file.indexOf('/'));
})));

const version = '2018.10.18-13.19-SNAPSHOT';

const parent = {
    groupId: 'no.nav.sbl.dialogarena',
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
        modules: {
            module: modules
        },
        dependencyManagement: {
            dependencies: {
                dependency: [{
                    groupId: 'no.nav.sbl.dialogarena',
                    artifactId: 'jaxb-adapters',
                    version
                }, {
                    groupId: 'joda-time',
                    artifactId: 'joda-time',
                    version: '2.10'
                }]
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

        const build = res.project.build ? res.project.build[0] : null;

        if (build && build.plugins) {
            delete build.resources;
            delete build.pluginManagement;
            res.project.build = {
                ...build,
                plugins: {
                    plugin: build.plugins[0].plugin.map(plugin => {
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
                        console.log(artifactId);
                        return [
                            'maven-assembly-plugin',
                            'maven-compiler-plugin',
                            'maven-release-plugin'
                        ].indexOf(artifactId) === -1;
                    })
                }
            };
        }

        /*
        <scm>
    <developerConnection></developerConnection>
    <connection>scm:git:git@github.com:navikt/nav-java-codestyle.git</connection>
    <url>https://github.com/navikt/nav-java-codestyle</url>
    <tag>HEAD</tag>
  </scm>
         */

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