
package no.aetat.arena.person;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Aktivitet
 * 
 * <p>Java class for AktivitetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AktivitetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TilDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatusAktiv" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Beskrivelse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Aktivitetkode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AktivitetId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
@XmlType(name = "AktivitetType", propOrder = {
    "fraDato",
    "tilDato",
    "statusAktiv",
    "beskrivelse",
    "aktivitetkode",
    "aktivitetId",
    "aksjonskode"
})
public class AktivitetType {

    @XmlElement(name = "FraDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fraDato;
    @XmlElement(name = "TilDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tilDato;
    @XmlElement(name = "StatusAktiv")
    protected String statusAktiv;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "Aktivitetkode")
    protected String aktivitetkode;
    @XmlElement(name = "AktivitetId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger aktivitetId;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;

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
     * Gets the value of the statusAktiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAktiv() {
        return statusAktiv;
    }

    /**
     * Sets the value of the statusAktiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAktiv(String value) {
        this.statusAktiv = value;
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
     * Gets the value of the aktivitetkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivitetkode() {
        return aktivitetkode;
    }

    /**
     * Sets the value of the aktivitetkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivitetkode(String value) {
        this.aktivitetkode = value;
    }

    /**
     * Gets the value of the aktivitetId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAktivitetId() {
        return aktivitetId;
    }

    /**
     * Sets the value of the aktivitetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAktivitetId(BigInteger value) {
        this.aktivitetId = value;
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

    public AktivitetType withFraDato(XMLGregorianCalendar value) {
        setFraDato(value);
        return this;
    }

    public AktivitetType withTilDato(XMLGregorianCalendar value) {
        setTilDato(value);
        return this;
    }

    public AktivitetType withStatusAktiv(String value) {
        setStatusAktiv(value);
        return this;
    }

    public AktivitetType withBeskrivelse(String value) {
        setBeskrivelse(value);
        return this;
    }

    public AktivitetType withAktivitetkode(String value) {
        setAktivitetkode(value);
        return this;
    }

    public AktivitetType withAktivitetId(BigInteger value) {
        setAktivitetId(value);
        return this;
    }

    public AktivitetType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
