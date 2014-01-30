
package no.aetat.arena.aetat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aetatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aetatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AetatId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Aetatnavn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adresser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Adresse" type="{http://www.aetat.no/arena/aetat.xsd}AetatAdresseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Kommunikasjoner">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Kommunikasjon" type="{http://www.aetat.no/arena/aetat.xsd}KommunikasjonType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "aetatType", propOrder = {
    "aetatId",
    "aetatnavn",
    "adresser",
    "kommunikasjoner"
})
public class AetatType {

    @XmlElement(name = "AetatId", required = true)
    protected String aetatId;
    @XmlElement(name = "Aetatnavn", required = true)
    protected String aetatnavn;
    @XmlElement(name = "Adresser", required = true)
    protected AetatType.Adresser adresser;
    @XmlElement(name = "Kommunikasjoner", required = true)
    protected AetatType.Kommunikasjoner kommunikasjoner;

    /**
     * Gets the value of the aetatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAetatId() {
        return aetatId;
    }

    /**
     * Sets the value of the aetatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAetatId(String value) {
        this.aetatId = value;
    }

    /**
     * Gets the value of the aetatnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAetatnavn() {
        return aetatnavn;
    }

    /**
     * Sets the value of the aetatnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAetatnavn(String value) {
        this.aetatnavn = value;
    }

    /**
     * Gets the value of the adresser property.
     * 
     * @return
     *     possible object is
     *     {@link AetatType.Adresser }
     *     
     */
    public AetatType.Adresser getAdresser() {
        return adresser;
    }

    /**
     * Sets the value of the adresser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AetatType.Adresser }
     *     
     */
    public void setAdresser(AetatType.Adresser value) {
        this.adresser = value;
    }

    /**
     * Gets the value of the kommunikasjoner property.
     * 
     * @return
     *     possible object is
     *     {@link AetatType.Kommunikasjoner }
     *     
     */
    public AetatType.Kommunikasjoner getKommunikasjoner() {
        return kommunikasjoner;
    }

    /**
     * Sets the value of the kommunikasjoner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AetatType.Kommunikasjoner }
     *     
     */
    public void setKommunikasjoner(AetatType.Kommunikasjoner value) {
        this.kommunikasjoner = value;
    }

    public AetatType withAetatId(String value) {
        setAetatId(value);
        return this;
    }

    public AetatType withAetatnavn(String value) {
        setAetatnavn(value);
        return this;
    }

    public AetatType withAdresser(AetatType.Adresser value) {
        setAdresser(value);
        return this;
    }

    public AetatType withKommunikasjoner(AetatType.Kommunikasjoner value) {
        setKommunikasjoner(value);
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
     *         &lt;element name="Adresse" type="{http://www.aetat.no/arena/aetat.xsd}AetatAdresseType" maxOccurs="unbounded" minOccurs="0"/>
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
        "adresse"
    })
    public static class Adresser {

        @XmlElement(name = "Adresse")
        protected List<AetatAdresseType> adresse;

        /**
         * Gets the value of the adresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdresse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AetatAdresseType }
         * 
         * 
         */
        public List<AetatAdresseType> getAdresse() {
            if (adresse == null) {
                adresse = new ArrayList<AetatAdresseType>();
            }
            return this.adresse;
        }

        public AetatType.Adresser withAdresse(AetatAdresseType... values) {
            if (values!= null) {
                for (AetatAdresseType value: values) {
                    getAdresse().add(value);
                }
            }
            return this;
        }

        public AetatType.Adresser withAdresse(Collection<AetatAdresseType> values) {
            if (values!= null) {
                getAdresse().addAll(values);
            }
            return this;
        }

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
     *         &lt;element name="Kommunikasjon" type="{http://www.aetat.no/arena/aetat.xsd}KommunikasjonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "kommunikasjon"
    })
    public static class Kommunikasjoner {

        @XmlElement(name = "Kommunikasjon")
        protected List<KommunikasjonType> kommunikasjon;

        /**
         * Gets the value of the kommunikasjon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kommunikasjon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKommunikasjon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KommunikasjonType }
         * 
         * 
         */
        public List<KommunikasjonType> getKommunikasjon() {
            if (kommunikasjon == null) {
                kommunikasjon = new ArrayList<KommunikasjonType>();
            }
            return this.kommunikasjon;
        }

        public AetatType.Kommunikasjoner withKommunikasjon(KommunikasjonType... values) {
            if (values!= null) {
                for (KommunikasjonType value: values) {
                    getKommunikasjon().add(value);
                }
            }
            return this;
        }

        public AetatType.Kommunikasjoner withKommunikasjon(Collection<KommunikasjonType> values) {
            if (values!= null) {
                getKommunikasjon().addAll(values);
            }
            return this;
        }

    }

}
