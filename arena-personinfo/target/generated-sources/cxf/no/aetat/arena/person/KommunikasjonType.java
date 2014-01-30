
package no.aetat.arena.person;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Kommunikasjon
 * 
 * <p>Java class for KommunikasjonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KommunikasjonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kommunikasjonstreng">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kommunikasjonskode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KommunikasjonId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
@XmlType(name = "KommunikasjonType", propOrder = {
    "kommunikasjonstreng",
    "kommunikasjonskode",
    "kommunikasjonId",
    "aksjonskode"
})
public class KommunikasjonType {

    @XmlElement(name = "Kommunikasjonstreng", required = true)
    protected String kommunikasjonstreng;
    @XmlElement(name = "Kommunikasjonskode", required = true)
    protected String kommunikasjonskode;
    @XmlElement(name = "KommunikasjonId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger kommunikasjonId;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;

    /**
     * Gets the value of the kommunikasjonstreng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunikasjonstreng() {
        return kommunikasjonstreng;
    }

    /**
     * Sets the value of the kommunikasjonstreng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunikasjonstreng(String value) {
        this.kommunikasjonstreng = value;
    }

    /**
     * Gets the value of the kommunikasjonskode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunikasjonskode() {
        return kommunikasjonskode;
    }

    /**
     * Sets the value of the kommunikasjonskode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunikasjonskode(String value) {
        this.kommunikasjonskode = value;
    }

    /**
     * Gets the value of the kommunikasjonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKommunikasjonId() {
        return kommunikasjonId;
    }

    /**
     * Sets the value of the kommunikasjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKommunikasjonId(BigInteger value) {
        this.kommunikasjonId = value;
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

    public KommunikasjonType withKommunikasjonstreng(String value) {
        setKommunikasjonstreng(value);
        return this;
    }

    public KommunikasjonType withKommunikasjonskode(String value) {
        setKommunikasjonskode(value);
        return this;
    }

    public KommunikasjonType withKommunikasjonId(BigInteger value) {
        setKommunikasjonId(value);
        return this;
    }

    public KommunikasjonType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

}
