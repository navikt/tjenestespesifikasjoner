
package no.aetat.arena.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Personalia
 * 
 * <p>Java class for PersonaliaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonaliaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fornavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Etternavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fodselsnr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusDnr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fodselsdato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Maalform" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LandkodeStatsborger" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kjonn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FGKode" type="{http://www.aetat.no/arena/person.xsd}Formidlingsgruppetype" minOccurs="0"/>
 *         &lt;element name="DatoInaktivert" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LonnslippEpost" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EpostAdresse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "PersonaliaType", propOrder = {
    "fornavn",
    "etternavn",
    "fodselsnr",
    "statusDnr",
    "fodselsdato",
    "maalform",
    "landkodeStatsborger",
    "kjonn",
    "fgKode",
    "datoInaktivert",
    "lonnslippEpost",
    "epostAdresse"
})
public class PersonaliaType {

    @XmlElement(name = "Fornavn", required = true)
    protected String fornavn;
    @XmlElement(name = "Etternavn", required = true)
    protected String etternavn;
    @XmlElement(name = "Fodselsnr")
    protected String fodselsnr;
    @XmlElement(name = "StatusDnr")
    protected String statusDnr;
    @XmlElement(name = "Fodselsdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fodselsdato;
    @XmlElement(name = "Maalform")
    protected String maalform;
    @XmlElement(name = "LandkodeStatsborger")
    protected String landkodeStatsborger;
    @XmlElement(name = "Kjonn")
    protected String kjonn;
    @XmlElement(name = "FGKode")
    protected Formidlingsgruppetype fgKode;
    @XmlElement(name = "DatoInaktivert")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoInaktivert;
    @XmlElement(name = "LonnslippEpost")
    protected String lonnslippEpost;
    @XmlElement(name = "EpostAdresse")
    protected String epostAdresse;

    /**
     * Gets the value of the fornavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets the value of the fornavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornavn(String value) {
        this.fornavn = value;
    }

    /**
     * Gets the value of the etternavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtternavn() {
        return etternavn;
    }

    /**
     * Sets the value of the etternavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtternavn(String value) {
        this.etternavn = value;
    }

    /**
     * Gets the value of the fodselsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodselsnr() {
        return fodselsnr;
    }

    /**
     * Sets the value of the fodselsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodselsnr(String value) {
        this.fodselsnr = value;
    }

    /**
     * Gets the value of the statusDnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDnr() {
        return statusDnr;
    }

    /**
     * Sets the value of the statusDnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDnr(String value) {
        this.statusDnr = value;
    }

    /**
     * Gets the value of the fodselsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFodselsdato() {
        return fodselsdato;
    }

    /**
     * Sets the value of the fodselsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFodselsdato(XMLGregorianCalendar value) {
        this.fodselsdato = value;
    }

    /**
     * Gets the value of the maalform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaalform() {
        return maalform;
    }

    /**
     * Sets the value of the maalform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaalform(String value) {
        this.maalform = value;
    }

    /**
     * Gets the value of the landkodeStatsborger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandkodeStatsborger() {
        return landkodeStatsborger;
    }

    /**
     * Sets the value of the landkodeStatsborger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandkodeStatsborger(String value) {
        this.landkodeStatsborger = value;
    }

    /**
     * Gets the value of the kjonn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKjonn() {
        return kjonn;
    }

    /**
     * Sets the value of the kjonn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKjonn(String value) {
        this.kjonn = value;
    }

    /**
     * Gets the value of the fgKode property.
     * 
     * @return
     *     possible object is
     *     {@link Formidlingsgruppetype }
     *     
     */
    public Formidlingsgruppetype getFGKode() {
        return fgKode;
    }

    /**
     * Sets the value of the fgKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formidlingsgruppetype }
     *     
     */
    public void setFGKode(Formidlingsgruppetype value) {
        this.fgKode = value;
    }

    /**
     * Gets the value of the datoInaktivert property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoInaktivert() {
        return datoInaktivert;
    }

    /**
     * Sets the value of the datoInaktivert property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoInaktivert(XMLGregorianCalendar value) {
        this.datoInaktivert = value;
    }

    /**
     * Gets the value of the lonnslippEpost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLonnslippEpost() {
        return lonnslippEpost;
    }

    /**
     * Sets the value of the lonnslippEpost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLonnslippEpost(String value) {
        this.lonnslippEpost = value;
    }

    /**
     * Gets the value of the epostAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpostAdresse() {
        return epostAdresse;
    }

    /**
     * Sets the value of the epostAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpostAdresse(String value) {
        this.epostAdresse = value;
    }

    public PersonaliaType withFornavn(String value) {
        setFornavn(value);
        return this;
    }

    public PersonaliaType withEtternavn(String value) {
        setEtternavn(value);
        return this;
    }

    public PersonaliaType withFodselsnr(String value) {
        setFodselsnr(value);
        return this;
    }

    public PersonaliaType withStatusDnr(String value) {
        setStatusDnr(value);
        return this;
    }

    public PersonaliaType withFodselsdato(XMLGregorianCalendar value) {
        setFodselsdato(value);
        return this;
    }

    public PersonaliaType withMaalform(String value) {
        setMaalform(value);
        return this;
    }

    public PersonaliaType withLandkodeStatsborger(String value) {
        setLandkodeStatsborger(value);
        return this;
    }

    public PersonaliaType withKjonn(String value) {
        setKjonn(value);
        return this;
    }

    public PersonaliaType withFGKode(Formidlingsgruppetype value) {
        setFGKode(value);
        return this;
    }

    public PersonaliaType withDatoInaktivert(XMLGregorianCalendar value) {
        setDatoInaktivert(value);
        return this;
    }

    public PersonaliaType withLonnslippEpost(String value) {
        setLonnslippEpost(value);
        return this;
    }

    public PersonaliaType withEpostAdresse(String value) {
        setEpostAdresse(value);
        return this;
    }

}
