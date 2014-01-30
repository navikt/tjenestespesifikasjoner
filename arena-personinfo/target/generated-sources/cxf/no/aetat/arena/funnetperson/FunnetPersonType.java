
package no.aetat.arena.funnetperson;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunnetPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunnetPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Kandidatnummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Navn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="61"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Bosted" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Jobbonske" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Matchverdi" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StatusSamtykke" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "FunnetPersonType", propOrder = {
    "personId",
    "kandidatnummer",
    "navn",
    "bosted",
    "jobbonske",
    "matchverdi",
    "statusSamtykke"
})
public class FunnetPersonType {

    @XmlElement(name = "PersonId", required = true)
    protected BigInteger personId;
    @XmlElement(name = "Kandidatnummer")
    protected String kandidatnummer;
    @XmlElement(name = "Navn", required = true)
    protected String navn;
    @XmlElement(name = "Bosted")
    protected String bosted;
    @XmlElement(name = "Jobbonske")
    protected String jobbonske;
    @XmlElement(name = "Matchverdi", required = true)
    protected BigInteger matchverdi;
    @XmlElement(name = "StatusSamtykke")
    protected String statusSamtykke;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonId(BigInteger value) {
        this.personId = value;
    }

    /**
     * Gets the value of the kandidatnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatnummer() {
        return kandidatnummer;
    }

    /**
     * Sets the value of the kandidatnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatnummer(String value) {
        this.kandidatnummer = value;
    }

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the bosted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBosted() {
        return bosted;
    }

    /**
     * Sets the value of the bosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBosted(String value) {
        this.bosted = value;
    }

    /**
     * Gets the value of the jobbonske property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobbonske() {
        return jobbonske;
    }

    /**
     * Sets the value of the jobbonske property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobbonske(String value) {
        this.jobbonske = value;
    }

    /**
     * Gets the value of the matchverdi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchverdi() {
        return matchverdi;
    }

    /**
     * Sets the value of the matchverdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchverdi(BigInteger value) {
        this.matchverdi = value;
    }

    /**
     * Gets the value of the statusSamtykke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSamtykke() {
        return statusSamtykke;
    }

    /**
     * Sets the value of the statusSamtykke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSamtykke(String value) {
        this.statusSamtykke = value;
    }

    public FunnetPersonType withPersonId(BigInteger value) {
        setPersonId(value);
        return this;
    }

    public FunnetPersonType withKandidatnummer(String value) {
        setKandidatnummer(value);
        return this;
    }

    public FunnetPersonType withNavn(String value) {
        setNavn(value);
        return this;
    }

    public FunnetPersonType withBosted(String value) {
        setBosted(value);
        return this;
    }

    public FunnetPersonType withJobbonske(String value) {
        setJobbonske(value);
        return this;
    }

    public FunnetPersonType withMatchverdi(BigInteger value) {
        setMatchverdi(value);
        return this;
    }

    public FunnetPersonType withStatusSamtykke(String value) {
        setStatusSamtykke(value);
        return this;
    }

}
