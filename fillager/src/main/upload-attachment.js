//npm install request:xx

var request = require('request');
var util = require('util');
var fs = require('fs');

request = request.defaults({
    auth: {
        username: 'srvPortaler',
        password: 'PyTjo3mED6Q96c'
    }
});

var confluencePageId = '162739803';
var confluenceLink = util.format('http://confluence.adeo.no/pages/viewpage.action?pageId=%s', confluencePageId);

fs.readdir('./target/generated-resources/xml/xslt', function (err, files) {
    var filnavn = files[0];

    console.log(util.format('Filen : %s lastes opp til siden', filnavn, confluenceLink));

    request.get({
            url: util.format('http://confluence.adeo.no/rest/api/content/%s/child/attachment', confluencePageId),
            json: 'json'
        }, function (error, response, body) {
            if (error) {
                return console.error(error)
            }
            console.log(response.statusCode);
            console.log(body.results);
            var attachment = body.results.filter(function (attachment) {
                return attachment.title === filnavn;
            });
            if (attachment.length > 0) {
                console.log('Oppdater eksisterende vedlegg');

                var attachmentId = attachment[0].id;

                var formData = {
                    comment: 'Automatisk generert wsdl-dokumentasjon - oppdatering - node',
                    file: fs.createReadStream('./target/generated-resources/xml/xslt/FilLager.html')
                };

                request.post({
                        url: util.format('http://confluence.adeo.no/rest/api/content/%s/child/attachment/%s/data', confluencePageId, attachmentId ),
                        headers: {
                            'X-Atlassian-Token': 'nocheck'
                        },
                        formData: formData
                    }, function (error, response, body) {
                        if (error) {
                            return console.error(error)
                        }
                        console.log(response.statusCode);
                        console.log(body);
                    }
                )

            } else {
                console.log('POST')
            }

        });

});
