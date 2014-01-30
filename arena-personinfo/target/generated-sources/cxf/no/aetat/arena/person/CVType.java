
package no.aetat.arena.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for CV
 * 
 * <p>Java class for CVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Egenbeskrivelse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
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
@XmlType(name = "CVType", propOrder = {
    "egenbeskrivelse"
})
public class CVType {

    @XmlElement(name = "Egenbeskrivelse")
    protected String egenbeskrivelse;

    /**
     * Gets the value of the egenbeskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgenbeskrivelse() {
        return egenbeskrivelse;
    }

    /**
     * Sets the value of the egenbeskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgenbeskrivelse(String value) {
        this.egenbeskrivelse = value;
    }

    public CVType withEgenbeskrivelse(String value) {
        setEgenbeskrivelse(value);
        return this;
    }

}
