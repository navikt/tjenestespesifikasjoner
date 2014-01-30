
package no.aetat.arena.fodselsnr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FodselsnrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FodselsnrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fodselsnummer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
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
@XmlType(name = "FodselsnrType", propOrder = {
    "fodselsnummer"
})
@XmlSeeAlso({
    Fodselsnr.class
})
public class FodselsnrType {

    @XmlElement(name = "Fodselsnummer", required = true)
    protected String fodselsnummer;

    /**
     * Gets the value of the fodselsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodselsnummer() {
        return fodselsnummer;
    }

    /**
     * Sets the value of the fodselsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodselsnummer(String value) {
        this.fodselsnummer = value;
    }

    public FodselsnrType withFodselsnummer(String value) {
        setFodselsnummer(value);
        return this;
    }

}
