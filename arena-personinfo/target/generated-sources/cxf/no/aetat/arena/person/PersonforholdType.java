
package no.aetat.arena.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Personforhold
 * 
 * <p>Java class for PersonforholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonforholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kommentar" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FraDato" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TilDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Personforholdkode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "PersonforholdType", propOrder = {
    "kommentar",
    "fraDato",
    "tilDato",
    "personforholdkode",
    "aksjonskode"
})
public class PersonforholdType {

    @XmlElement(name = "Kommentar")
    protected String kommentar;
    @XmlElement(name = "FraDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fraDato;
    @XmlElement(name = "TilDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tilDato;
    @XmlElement(name = "Personforholdkode", required = true)
    protected String personforholdkode;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;

    /**
     * Gets the value of the kommentar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Sets the value of the kommentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommentar(String value) {
        this.kommentar = value;
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
     * Gets the value of the personforholdkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonforholdkode() {
        return personforholdkode;
    }

    /**
     * Sets the value of the personforholdkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonforholdkode(String value) {
        this.personforholdkode = value;
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

    public PersonforholdType withKommentar(String value) {
        setKommentar(value);
        return this;
    }

    public PersonforholdType withFraDato(XMLGregorianCalendar value) {
        setFraDato(value);
        return this;
    }

    public PersonforholdType withTilDato(XMLGregorianCalendar value) {
        setTilDato(value);
        return this;
    }

    public PersonforholdType withPersonforholdkode(String value) {
        setPersonforholdkode(value);
        return this;
    }

    public PersonforholdType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
