
package no.aetat.arena.aetat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
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
    "kommunikasjonskode"
})
public class KommunikasjonType {

    @XmlElement(name = "Kommunikasjonstreng", required = true)
    protected String kommunikasjonstreng;
    @XmlElement(name = "Kommunikasjonskode", required = true)
    protected String kommunikasjonskode;

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

    public KommunikasjonType withKommunikasjonstreng(String value) {
        setKommunikasjonstreng(value);
        return this;
    }

    public KommunikasjonType withKommunikasjonskode(String value) {
        setKommunikasjonskode(value);
        return this;
    }

}
