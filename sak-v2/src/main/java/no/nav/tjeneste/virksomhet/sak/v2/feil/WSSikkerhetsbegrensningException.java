package no.nav.tjeneste.virksomhet.sak.v2.feil;

public class WSSikkerhetsbegrensningException extends Exception {
    private String feilkilde;
    private String feilmelding;

    public String getFeilkilde() {
        return this.feilkilde;
    }

    public void setFeilkilde(String feilkilde) {
        this.feilkilde = feilkilde;
    }

    public String getFeilmelding() {
        return this.feilmelding;
    }

    public void setFeilmelding(String feilmelding) {
        this.feilmelding = feilmelding;
    }
}