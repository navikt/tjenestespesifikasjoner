
package no.aetat.arena.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Samtykke
 * 
 * <p>Java class for SamtykkeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamtykkeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusSamtykke">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatoSamtykke" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamtykkeType", propOrder = {
    "statusSamtykke",
    "datoSamtykke"
})
public class SamtykkeType {

    @XmlElement(name = "StatusSamtykke", required = true)
    protected String statusSamtykke;
    @XmlElement(name = "DatoSamtykke")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoSamtykke;

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

    /**
     * Gets the value of the datoSamtykke property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoSamtykke() {
        return datoSamtykke;
    }

    /**
     * Sets the value of the datoSamtykke property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoSamtykke(XMLGregorianCalendar value) {
        this.datoSamtykke = value;
    }

    public SamtykkeType withStatusSamtykke(String value) {
        setStatusSamtykke(value);
        return this;
    }

    public SamtykkeType withDatoSamtykke(XMLGregorianCalendar value) {
        setDatoSamtykke(value);
        return this;
    }

}
