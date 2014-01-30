
package no.aetat.arena.sokperson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SokPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SokPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fornavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Etternavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fodselsdato" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SokPersonType", propOrder = {
    "fornavn",
    "etternavn",
    "fodselsdato"
})
@XmlSeeAlso({
    SokPerson.class
})
public class SokPersonType {

    @XmlElement(name = "Fornavn", required = true)
    protected String fornavn;
    @XmlElement(name = "Etternavn", required = true)
    protected String etternavn;
    @XmlElement(name = "Fodselsdato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fodselsdato;

    /**
     * Gets the value of the fornavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets the value of the fornavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornavn(String value) {
        this.fornavn = value;
    }

    /**
     * Gets the value of the etternavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtternavn() {
        return etternavn;
    }

    /**
     * Sets the value of the etternavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtternavn(String value) {
        this.etternavn = value;
    }

    /**
     * Gets the value of the fodselsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFodselsdato() {
        return fodselsdato;
    }

    /**
     * Sets the value of the fodselsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFodselsdato(XMLGregorianCalendar value) {
        this.fodselsdato = value;
    }

    public SokPersonType withFornavn(String value) {
        setFornavn(value);
        return this;
    }

    public SokPersonType withEtternavn(String value) {
        setEtternavn(value);
        return this;
    }

    public SokPersonType withFodselsdato(XMLGregorianCalendar value) {
        setFodselsdato(value);
        return this;
    }

}
