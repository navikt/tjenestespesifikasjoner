
package no.aetat.arena.person;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for adresse
 * 
 * <p>Java class for AdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Postnr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrlinje3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Landkode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adressetype">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdressebrukId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
@XmlType(name = "AdresseType", propOrder = {
    "postnr",
    "adrlinje1",
    "adrlinje2",
    "adrlinje3",
    "landkode",
    "adressetype",
    "adressebrukId",
    "aksjonskode"
})
public class AdresseType {

    @XmlElement(name = "Postnr")
    protected String postnr;
    @XmlElement(name = "Adrlinje1")
    protected String adrlinje1;
    @XmlElement(name = "Adrlinje2")
    protected String adrlinje2;
    @XmlElement(name = "Adrlinje3")
    protected String adrlinje3;
    @XmlElement(name = "Landkode", required = true)
    protected String landkode;
    @XmlElement(name = "Adressetype", required = true)
    protected String adressetype;
    @XmlElement(name = "AdressebrukId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger adressebrukId;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;

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
     * Gets the value of the landkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandkode() {
        return landkode;
    }

    /**
     * Sets the value of the landkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandkode(String value) {
        this.landkode = value;
    }

    /**
     * Gets the value of the adressetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressetype() {
        return adressetype;
    }

    /**
     * Sets the value of the adressetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressetype(String value) {
        this.adressetype = value;
    }

    /**
     * Gets the value of the adressebrukId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdressebrukId() {
        return adressebrukId;
    }

    /**
     * Sets the value of the adressebrukId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdressebrukId(BigInteger value) {
        this.adressebrukId = value;
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

    public AdresseType withPostnr(String value) {
        setPostnr(value);
        return this;
    }

    public AdresseType withAdrlinje1(String value) {
        setAdrlinje1(value);
        return this;
    }

    public AdresseType withAdrlinje2(String value) {
        setAdrlinje2(value);
        return this;
    }

    public AdresseType withAdrlinje3(String value) {
        setAdrlinje3(value);
        return this;
    }

    public AdresseType withLandkode(String value) {
        setLandkode(value);
        return this;
    }

    public AdresseType withAdressetype(String value) {
        setAdressetype(value);
        return this;
    }

    public AdresseType withAdressebrukId(BigInteger value) {
        setAdressebrukId(value);
        return this;
    }

    public AdresseType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
