
package no.aetat.arena.adresse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KontorAdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontorAdresseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GateAdresse" type="{http://www.aetat.no/arena/adresse.xsd}GateAdresseType"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/choice>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontorAdresseType", propOrder = {
    "gateAdresse",
    "personId"
})
public class KontorAdresseType {

    @XmlElement(name = "GateAdresse")
    protected GateAdresseType gateAdresse;
    @XmlElement(name = "PersonId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger personId;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the gateAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link GateAdresseType }
     *     
     */
    public GateAdresseType getGateAdresse() {
        return gateAdresse;
    }

    /**
     * Sets the value of the gateAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GateAdresseType }
     *     
     */
    public void setGateAdresse(GateAdresseType value) {
        this.gateAdresse = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public KontorAdresseType withGateAdresse(GateAdresseType value) {
        setGateAdresse(value);
        return this;
    }

    public KontorAdresseType withPersonId(BigInteger value) {
        setPersonId(value);
        return this;
    }

    public KontorAdresseType withId(String value) {
        setId(value);
        return this;
    }

}
