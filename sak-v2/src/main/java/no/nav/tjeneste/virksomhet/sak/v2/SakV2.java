package no.nav.tjeneste.virksomhet.sak.v2;

import no.nav.tjeneste.virksomhet.sak.v2.feil.WSSikkerhetsbegrensningException;
import no.nav.tjeneste.virksomhet.sak.v2.feil.WSUgyldigInputException;
import no.nav.tjeneste.virksomhet.sak.v2.meldinger.WSFinnSakerForBrukerRequest;
import no.nav.tjeneste.virksomhet.sak.v2.meldinger.WSFinnSakerForBrukerResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.Addressing;

@WebService(
        targetNamespace = "http://nav.no/tjeneste/virksomhet/sak/v2",
        name = "Sak_v2",
        serviceName = "Sak_v2"

)
@Addressing
public interface SakV2 {
    @WebMethod(
            action = "http://nav.no/tjeneste/virksomhet/sak/v2/Sak_v2/finnSakerForBrukerRequest"
    )
    WSFinnSakerForBrukerResponse finnSakerForBruker(WSFinnSakerForBrukerRequest request) throws WSSikkerhetsbegrensningException, WSUgyldigInputException;

    @WebMethod(
            action = "http://nav.no/tjeneste/virksomhet/sak/v2/Sak_v2/pingRequest"
    )
    void ping();
}
