package no.nav.tjeneste.virksomhet.sak.v2.informasjon;

public class WSAktor {

    private String ident;
    private WSAktorType aktorType;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public WSAktor withIdent(String ident) {
        this.ident = ident;
        return this;
    }

    public WSAktorType getAktorType() {
        return aktorType;
    }

    public void setAktorType(WSAktorType aktorType) {
        this.aktorType = aktorType;
    }

    public WSAktor withAktorType(WSAktorType type) {
        this.aktorType = type;
        return this;
    }

    public enum WSAktorType {
        PERSON,
        ORGANISASJON,
        UKJENT;
    }
}
