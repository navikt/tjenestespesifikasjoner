
package no.aetat.arena.personstatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonstatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonstatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PersonData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusArbeidsoker">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                         &lt;enumeration value="ARBS"/>
 *                         &lt;enumeration value="IARBS"/>
 *                         &lt;enumeration value="PARBS"/>
 *                         &lt;enumeration value="RARBS"/>
 *                         &lt;enumeration value="ISERV"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StatusYtelse">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="INDS"/>
 *                         &lt;enumeration value="DAGP"/>
 *                         &lt;enumeration value="IYT"/>
 *                         &lt;enumeration value="ATTF"/>
 *                         &lt;enumeration value="VENT"/>
 *                         &lt;enumeration value="AAP"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Valideringsfeil" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;enumeration value="-20807"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonstatusType", propOrder = {
    "personData",
    "valideringsfeil"
})
@XmlSeeAlso({
    Personstatus.class
})
public class PersonstatusType {

    @XmlElement(name = "PersonData")
    protected PersonstatusType.PersonData personData;
    @XmlElement(name = "Valideringsfeil")
    protected String valideringsfeil;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonstatusType.PersonData }
     *     
     */
    public PersonstatusType.PersonData getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonstatusType.PersonData }
     *     
     */
    public void setPersonData(PersonstatusType.PersonData value) {
        this.personData = value;
    }

    /**
     * Gets the value of the valideringsfeil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValideringsfeil() {
        return valideringsfeil;
    }

    /**
     * Sets the value of the valideringsfeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValideringsfeil(String value) {
        this.valideringsfeil = value;
    }

    public PersonstatusType withPersonData(PersonstatusType.PersonData value) {
        setPersonData(value);
        return this;
    }

    public PersonstatusType withValideringsfeil(String value) {
        setValideringsfeil(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StatusArbeidsoker">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *               &lt;enumeration value="ARBS"/>
     *               &lt;enumeration value="IARBS"/>
     *               &lt;enumeration value="PARBS"/>
     *               &lt;enumeration value="RARBS"/>
     *               &lt;enumeration value="ISERV"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StatusYtelse">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="INDS"/>
     *               &lt;enumeration value="DAGP"/>
     *               &lt;enumeration value="IYT"/>
     *               &lt;enumeration value="ATTF"/>
     *               &lt;enumeration value="VENT"/>
     *               &lt;enumeration value="AAP"/>
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
    @XmlType(name = "", propOrder = {
        "statusArbeidsoker",
        "statusYtelse"
    })
    public static class PersonData {

        @XmlElement(name = "StatusArbeidsoker", required = true)
        protected String statusArbeidsoker;
        @XmlElement(name = "StatusYtelse", required = true)
        protected String statusYtelse;

        /**
         * Gets the value of the statusArbeidsoker property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusArbeidsoker() {
            return statusArbeidsoker;
        }

        /**
         * Sets the value of the statusArbeidsoker property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusArbeidsoker(String value) {
            this.statusArbeidsoker = value;
        }

        /**
         * Gets the value of the statusYtelse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusYtelse() {
            return statusYtelse;
        }

        /**
         * Sets the value of the statusYtelse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusYtelse(String value) {
            this.statusYtelse = value;
        }

        public PersonstatusType.PersonData withStatusArbeidsoker(String value) {
            setStatusArbeidsoker(value);
            return this;
        }

        public PersonstatusType.PersonData withStatusYtelse(String value) {
            setStatusYtelse(value);
            return this;
        }

    }

}
