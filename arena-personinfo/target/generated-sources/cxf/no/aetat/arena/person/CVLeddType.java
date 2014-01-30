
package no.aetat.arena.person;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for CVLedd
 * 
 * <p>Java class for CVLeddType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVLeddType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfilelementId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Leddkode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Leddtekst1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Leddtekst2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Beskrivelse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FraDato" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TilDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatusDokumentasjon">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OmfangVerdi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OmfangMaaleenhet" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Hensyn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Lopenr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Aksjonskode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVLeddType", propOrder = {
    "profilelementId",
    "leddkode",
    "leddtekst1",
    "leddtekst2",
    "beskrivelse",
    "fraDato",
    "tilDato",
    "statusDokumentasjon",
    "omfangVerdi",
    "omfangMaaleenhet",
    "hensyn",
    "lopenr",
    "aksjonskode"
})
public class CVLeddType {

    @XmlElement(name = "ProfilelementId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger profilelementId;
    @XmlElement(name = "Leddkode", required = true)
    protected String leddkode;
    @XmlElement(name = "Leddtekst1")
    protected String leddtekst1;
    @XmlElement(name = "Leddtekst2")
    protected String leddtekst2;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "FraDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fraDato;
    @XmlElement(name = "TilDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tilDato;
    @XmlElement(name = "StatusDokumentasjon", required = true)
    protected String statusDokumentasjon;
    @XmlElement(name = "OmfangVerdi")
    protected Integer omfangVerdi;
    @XmlElement(name = "OmfangMaaleenhet")
    protected String omfangMaaleenhet;
    @XmlElement(name = "Hensyn", required = true)
    protected String hensyn;
    @XmlElement(name = "Lopenr", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lopenr;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;

    /**
     * Gets the value of the profilelementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfilelementId() {
        return profilelementId;
    }

    /**
     * Sets the value of the profilelementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfilelementId(BigInteger value) {
        this.profilelementId = value;
    }

    /**
     * Gets the value of the leddkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeddkode() {
        return leddkode;
    }

    /**
     * Sets the value of the leddkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeddkode(String value) {
        this.leddkode = value;
    }

    /**
     * Gets the value of the leddtekst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeddtekst1() {
        return leddtekst1;
    }

    /**
     * Sets the value of the leddtekst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeddtekst1(String value) {
        this.leddtekst1 = value;
    }

    /**
     * Gets the value of the leddtekst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeddtekst2() {
        return leddtekst2;
    }

    /**
     * Sets the value of the leddtekst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeddtekst2(String value) {
        this.leddtekst2 = value;
    }

    /**
     * Gets the value of the beskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets the value of the beskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelse(String value) {
        this.beskrivelse = value;
    }

    /**
     * Gets the value of the fraDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFraDato() {
        return fraDato;
    }

    /**
     * Sets the value of the fraDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFraDato(XMLGregorianCalendar value) {
        this.fraDato = value;
    }

    /**
     * Gets the value of the tilDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTilDato() {
        return tilDato;
    }

    /**
     * Sets the value of the tilDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTilDato(XMLGregorianCalendar value) {
        this.tilDato = value;
    }

    /**
     * Gets the value of the statusDokumentasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDokumentasjon() {
        return statusDokumentasjon;
    }

    /**
     * Sets the value of the statusDokumentasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDokumentasjon(String value) {
        this.statusDokumentasjon = value;
    }

    /**
     * Gets the value of the omfangVerdi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOmfangVerdi() {
        return omfangVerdi;
    }

    /**
     * Sets the value of the omfangVerdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOmfangVerdi(Integer value) {
        this.omfangVerdi = value;
    }

    /**
     * Gets the value of the omfangMaaleenhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmfangMaaleenhet() {
        return omfangMaaleenhet;
    }

    /**
     * Sets the value of the omfangMaaleenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmfangMaaleenhet(String value) {
        this.omfangMaaleenhet = value;
    }

    /**
     * Gets the value of the hensyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHensyn() {
        return hensyn;
    }

    /**
     * Sets the value of the hensyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHensyn(String value) {
        this.hensyn = value;
    }

    /**
     * Gets the value of the lopenr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLopenr() {
        return lopenr;
    }

    /**
     * Sets the value of the lopenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLopenr(BigInteger value) {
        this.lopenr = value;
    }

    /**
     * Gets the value of the aksjonskode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAksjonskode() {
        return aksjonskode;
    }

    /**
     * Sets the value of the aksjonskode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAksjonskode(String value) {
        this.aksjonskode = value;
    }

    public CVLeddType withProfilelementId(BigInteger value) {
        setProfilelementId(value);
        return this;
    }

    public CVLeddType withLeddkode(String value) {
        setLeddkode(value);
        return this;
    }

    public CVLeddType withLeddtekst1(String value) {
        setLeddtekst1(value);
        return this;
    }

    public CVLeddType withLeddtekst2(String value) {
        setLeddtekst2(value);
        return this;
    }

    public CVLeddType withBeskrivelse(String value) {
        setBeskrivelse(value);
        return this;
    }

    public CVLeddType withFraDato(XMLGregorianCalendar value) {
        setFraDato(value);
        return this;
    }

    public CVLeddType withTilDato(XMLGregorianCalendar value) {
        setTilDato(value);
        return this;
    }

    public CVLeddType withStatusDokumentasjon(String value) {
        setStatusDokumentasjon(value);
        return this;
    }

    public CVLeddType withOmfangVerdi(Integer value) {
        setOmfangVerdi(value);
        return this;
    }

    public CVLeddType withOmfangMaaleenhet(String value) {
        setOmfangMaaleenhet(value);
        return this;
    }

    public CVLeddType withHensyn(String value) {
        setHensyn(value);
        return this;
    }

    public CVLeddType withLopenr(BigInteger value) {
        setLopenr(value);
        return this;
    }

    public CVLeddType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
