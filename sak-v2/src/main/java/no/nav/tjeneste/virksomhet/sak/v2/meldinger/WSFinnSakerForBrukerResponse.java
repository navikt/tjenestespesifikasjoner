package no.nav.tjeneste.virksomhet.sak.v2.meldinger;

import no.nav.tjeneste.virksomhet.sak.v2.informasjon.WSSak;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFinnSakerForBrukerResponse", propOrder = {
        "saker"
})
public class WSFinnSakerForBrukerResponse {

    protected List<WSSak> saker;

    public List<WSSak> getSaker() {
        if (saker == null) {
            saker = new ArrayList<WSSak>();
        }
        return this.saker;
    }

    public void setSaker(List<WSSak> saker) {
        this.saker = saker;
    }

    public WSFinnSakerForBrukerResponse withSaker(List<WSSak> saker) {
        this.saker = saker;
        return this;
    }
}
