const fs = require('fs');
const glob = require('glob');
const xml2js = require('xml2js');

const poms = glob.sync('*/pom.xml').filter(name => name.indexOf('rewrite') === -1);
const modules = Array.from(new Set(poms.map(file => {
    return file.substr(0, file.indexOf('/'));
})));

poms.forEach(file => {
    xml2js.parseString(fs.readFileSync(file, 'utf-8'), (err, res) => {
        if (err) {
            console.error('Could not parse file', file, err);
        }

        const folder = file.substr(0, file.indexOf('/'));
        const artifactId = res.project.artifactId[0];

        if (folder !== artifactId) {
            console.log(folder + ': ' + artifactId);
            fs.renameSync(folder, artifactId);
        }
    });
});
