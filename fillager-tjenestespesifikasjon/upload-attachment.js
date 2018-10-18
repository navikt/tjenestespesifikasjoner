var request = require('request');
var util = require('util');
var fs = require('fs');

request = request.defaults({
    auth: {
        username: 'srvPortaler',
        password: process.env.SYSTEMUSER_PASSWORD
    }
});
var args = process.argv.slice(2);
var confluencePageId = args[0];
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


        var uploadRequest = {
            headers: {
                'X-Atlassian-Token': 'nocheck'
            },
            formData: {
                comment: 'Automatisk generert dokumentasjon av wsdl',
                file: fs.createReadStream(util.format('./target/generated-resources/xml/xslt/%s', filnavn))
            }
        };

        var attachment = body.results.filter(function (attachment) {
            return attachment.title === filnavn;
        });
        if (attachment.length > 0) {
            console.log('Oppdatering av eksisterende dokumentasjon');

            var attachmentId = attachment[0].id;
            uploadRequest.url = util.format('http://confluence.adeo.no/rest/api/content/%s/child/attachment/%s/data', confluencePageId, attachmentId);
        } else {
            console.log('Ny dokumentasjon');
            uploadRequest.url = util.format('http://confluence.adeo.no/rest/api/content/%s/child/attachment', confluencePageId);
        }

        request.post(uploadRequest, function (error, response) {
                if (error) {
                    return console.error(error)
                }
                console.log(response.statusCode);
                console.log('Filen skal nå være et vedlegg til %s', confluenceLink);
            }
        )

    });

});
