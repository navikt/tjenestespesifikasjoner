package no.nav.tjeneste.virksomhet.sak.v2.informasjon;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Saksinformasjon.
 * <p>
 * <p>Java class for Sak complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Sak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sakId" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Identifikator"/>
 *         &lt;element name="sakstype" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Sakstyper"/>
 *         &lt;element name="fagomraade" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Fagomraader"/>
 *         &lt;element name="fagsystem" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Fagsystemer"/>
 *         &lt;element name="fagsystemSakId" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Identifikator" minOccurs="0"/>
 *         &lt;element name="gjelderBrukerListe" type="{http://nav.no/tjeneste/virksomhet/sak/v1/informasjon}Aktoer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://nav.no/tjeneste/virksomhet/sak/v1/metadata}Versjon"/>
 *       &lt;attGroup ref="{http://nav.no/tjeneste/virksomhet/sak/v1/metadata}Sporing"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSak", propOrder = {
        "sakId",
        "sakstype",
        "fagomraade",
        "gjelderBrukerListe"
})
public class WSSak {

    @XmlElement(required = true)
    protected String sakId;
    @XmlElement(required = true)
    protected String sakstype;
    @XmlElement(required = true)
    protected String fagomraade;
    @XmlElement(required = true)
    protected List<WSAktor> gjelderBrukerListe;
    @XmlAttribute
    protected String versjonsnummer;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar opprettelsetidspunkt;
    @XmlAttribute
    protected String opprettetAv;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endringstidspunkt;
    @XmlAttribute
    protected String endretAv;

    public String getSakId() {
        return sakId;
    }

    public void setSakId(String sakId) {
        this.sakId = sakId;
    }

    public String getSakstype() {
        return sakstype;
    }

    public void setSakstype(String sakstype) {
        this.sakstype = sakstype;
    }

    public String getFagomraade() {
        return fagomraade;
    }

    public void setFagomraade(String fagomraade) {
        this.fagomraade = fagomraade;
    }

    public List<WSAktor> getGjelderBrukerListe() {
        if (gjelderBrukerListe == null) {
            gjelderBrukerListe = new ArrayList<WSAktor>();
        }
        return this.gjelderBrukerListe;
    }

    public String getVersjonsnummer() {
        return versjonsnummer;
    }

    public void setVersjonsnummer(String versjonsnummer) {
        this.versjonsnummer = versjonsnummer;
    }

    public XMLGregorianCalendar getOpprettelsetidspunkt() {
        return opprettelsetidspunkt;
    }

    public void setOpprettelsetidspunkt(XMLGregorianCalendar opprettelsetidspunkt) {
        this.opprettelsetidspunkt = opprettelsetidspunkt;
    }

    public String getOpprettetAv() {
        return opprettetAv;
    }

    public void setOpprettetAv(String opprettetAv) {
        this.opprettetAv = opprettetAv;
    }

    public XMLGregorianCalendar getEndringstidspunkt() {
        return endringstidspunkt;
    }

    public void setEndringstidspunkt(XMLGregorianCalendar endringstidspunkt) {
        this.endringstidspunkt = endringstidspunkt;
    }

    public String getEndretAv() {
        return endretAv;
    }

    public void setEndretAv(String endretAv) {
        this.endretAv = endretAv;
    }

    public WSSak withSakId(String sakId) {
        this.sakId = sakId;
        return this;
    }

    public WSSak withSakstype(String sakstype) {
        this.sakstype = sakstype;
        return this;
    }

    public WSSak withGjelderBrukerListe(List<WSAktor> gjelderBrukerListe) {
        this.gjelderBrukerListe = gjelderBrukerListe;
        return this;
    }

    public WSSak withFagomraade(String fagomraade) {
        this.fagomraade = fagomraade;
        return this;
    }

    public WSSak withVersjonsnummer(String versjonsnummer) {
        this.versjonsnummer = versjonsnummer;
        return this;
    }

    public WSSak withOpprettelsetidspunkt(XMLGregorianCalendar opprettelsetidspunkt) {
        this.opprettelsetidspunkt = opprettelsetidspunkt;
        return this;
    }

    public WSSak withOpprettetAv(String opprettetAv) {
        this.opprettetAv = opprettetAv;
        return this;
    }

    public WSSak withEndringstidspunkt(XMLGregorianCalendar endringstidspunkt) {
        this.endringstidspunkt = endringstidspunkt;
        return this;
    }

    public WSSak withEndretAv(String endretAv) {
        this.endretAv = endretAv;
        return this;
    }
}
