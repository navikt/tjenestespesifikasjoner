
package no.aetat.arena.person;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Personprofilledd
 * 
 * <p>Java class for PersonprofilLeddType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonprofilLeddType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfilelementId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Leddkode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErPrimaertJobbonske" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Hensyn" minOccurs="0">
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
@XmlType(name = "PersonprofilLeddType", propOrder = {
    "profilelementId",
    "leddkode",
    "erPrimaertJobbonske",
    "hensyn",
    "aksjonskode"
})
public class PersonprofilLeddType {

    @XmlElement(name = "ProfilelementId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger profilelementId;
    @XmlElement(name = "Leddkode", required = true)
    protected String leddkode;
    @XmlElement(name = "ErPrimaertJobbonske")
    protected String erPrimaertJobbonske;
    @XmlElement(name = "Hensyn")
    protected String hensyn;
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
     * Gets the value of the erPrimaertJobbonske property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErPrimaertJobbonske() {
        return erPrimaertJobbonske;
    }

    /**
     * Sets the value of the erPrimaertJobbonske property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErPrimaertJobbonske(String value) {
        this.erPrimaertJobbonske = value;
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

    public PersonprofilLeddType withProfilelementId(BigInteger value) {
        setProfilelementId(value);
        return this;
    }

    public PersonprofilLeddType withLeddkode(String value) {
        setLeddkode(value);
        return this;
    }

    public PersonprofilLeddType withErPrimaertJobbonske(String value) {
        setErPrimaertJobbonske(value);
        return this;
    }

    public PersonprofilLeddType withHensyn(String value) {
        setHensyn(value);
        return this;
    }

    public PersonprofilLeddType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
