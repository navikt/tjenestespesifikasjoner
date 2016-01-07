//npm install request:xx


var request = require('request');
var fs = require('fs');

fs.readdir('./target/generated-resources/xml/xslt', function(err, files) {
    var filnavn = files[0];
    console.log('Filen som lastes opp er: ',filnavn);

    request.get(
        {   url: 'http://confluence.adeo.no/rest/api/content/162739803/child/attachment',
            json: 'json',
            auth: {
                username: 'srvPortaler',
                password: 'PyTjo3mED6Q96c'
            }
        }, function (error, response, body) {
            if(error){
                return console.error(error)
            }
            console.log(response.statusCode);
            console.log(body.results);
            var attachment = body.results.filter(function (attachment) {
                return attachment.title === filnavn;
            });
            if (attachment.length > 0) {
                console.log('PUT');
                var attachmentId = attachment[0].id;

            }else {
                console.log('POST')
            }

        });

});
