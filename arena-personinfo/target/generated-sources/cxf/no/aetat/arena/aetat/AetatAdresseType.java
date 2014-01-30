
package no.aetat.arena.aetat;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AetatAdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AetatAdresseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adressekode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Postnr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Poststednavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kommunenr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AetatAdresseType", propOrder = {
    "adressekode",
    "adrlinje1",
    "adrlinje2",
    "adrlinje3",
    "postnr",
    "poststednavn",
    "kommunenr"
})
public class AetatAdresseType {

    @XmlElement(name = "Adressekode", required = true)
    protected String adressekode;
    @XmlElement(name = "Adrlinje1", required = true)
    protected String adrlinje1;
    @XmlElement(name = "Adrlinje2")
    protected String adrlinje2;
    @XmlElement(name = "Adrlinje3")
    protected String adrlinje3;
    @XmlElement(name = "Postnr", required = true)
    protected String postnr;
    @XmlElement(name = "Poststednavn", required = true)
    protected String poststednavn;
    @XmlElement(name = "Kommunenr")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger kommunenr;

    /**
     * Gets the value of the adressekode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressekode() {
        return adressekode;
    }

    /**
     * Sets the value of the adressekode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressekode(String value) {
        this.adressekode = value;
    }

    /**
     * Gets the value of the adrlinje1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrlinje1() {
        return adrlinje1;
    }

    /**
     * Sets the value of the adrlinje1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrlinje1(String value) {
        this.adrlinje1 = value;
    }

    /**
     * Gets the value of the adrlinje2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrlinje2() {
        return adrlinje2;
    }

    /**
     * Sets the value of the adrlinje2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrlinje2(String value) {
        this.adrlinje2 = value;
    }

    /**
     * Gets the value of the adrlinje3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrlinje3() {
        return adrlinje3;
    }

    /**
     * Sets the value of the adrlinje3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrlinje3(String value) {
        this.adrlinje3 = value;
    }

    /**
     * Gets the value of the postnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostnr() {
        return postnr;
    }

    /**
     * Sets the value of the postnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostnr(String value) {
        this.postnr = value;
    }

    /**
     * Gets the value of the poststednavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoststednavn() {
        return poststednavn;
    }

    /**
     * Sets the value of the poststednavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoststednavn(String value) {
        this.poststednavn = value;
    }

    /**
     * Gets the value of the kommunenr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKommunenr() {
        return kommunenr;
    }

    /**
     * Sets the value of the kommunenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKommunenr(BigInteger value) {
        this.kommunenr = value;
    }

    public AetatAdresseType withAdressekode(String value) {
        setAdressekode(value);
        return this;
    }

    public AetatAdresseType withAdrlinje1(String value) {
        setAdrlinje1(value);
        return this;
    }

    public AetatAdresseType withAdrlinje2(String value) {
        setAdrlinje2(value);
        return this;
    }

    public AetatAdresseType withAdrlinje3(String value) {
        setAdrlinje3(value);
        return this;
    }

    public AetatAdresseType withPostnr(String value) {
        setPostnr(value);
        return this;
    }

    public AetatAdresseType withPoststednavn(String value) {
        setPoststednavn(value);
        return this;
    }

    public AetatAdresseType withKommunenr(BigInteger value) {
        setKommunenr(value);
        return this;
    }

}
