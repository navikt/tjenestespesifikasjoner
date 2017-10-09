package no.nav.tjeneste.virksomhet.sak.v2.meldinger;

import java.util.ArrayList;
import java.util.List;

public class WSFinnSakerForBrukerRequest {

    private String brukerId;
    private List<String> fagomrader;

    public String getBrukerId() {
        return brukerId;
    }

    public void setBrukerId(String brukerId) {
        this.brukerId = brukerId;
    }

    public List<String> getFagomrader() {
        if (fagomrader == null) {
            fagomrader = new ArrayList<String>();
        }
        return this.fagomrader;
    }

    public void setFagomrader(List<String> fagomrader) {
        this.fagomrader = fagomrader;
    }
}
