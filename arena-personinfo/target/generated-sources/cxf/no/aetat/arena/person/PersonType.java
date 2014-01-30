
package no.aetat.arena.person;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for person
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Kandidatnummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Personalia" type="{http://www.aetat.no/arena/person.xsd}PersonaliaType"/>
 *         &lt;element name="Adresser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Adresse" type="{http://www.aetat.no/arena/person.xsd}AdresseType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="Kommunikasjon" type="{http://www.aetat.no/arena/person.xsd}KommunikasjonType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CV" type="{http://www.aetat.no/arena/person.xsd}CVType"/>
 *         &lt;element name="CVLeddListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CVLedd" type="{http://www.aetat.no/arena/person.xsd}CVLeddType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Personprofil">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Personprofilledd" type="{http://www.aetat.no/arena/person.xsd}PersonprofilLeddType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonforholdListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PersonForhold" type="{http://www.aetat.no/arena/person.xsd}PersonforholdType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Samtykke" type="{http://www.aetat.no/arena/person.xsd}SamtykkeType" minOccurs="0"/>
 *         &lt;element name="StatusJobbskifter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BehovForAttforing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Aktivitetsliste">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Aktivitet" type="{http://www.aetat.no/arena/person.xsd}AktivitetType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Aksjonskode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatoFra" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatusLegitimert" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "personId",
    "kandidatnummer",
    "personalia",
    "adresser",
    "kommunikasjoner",
    "cv",
    "cvLeddListe",
    "personprofil",
    "personforholdListe",
    "samtykke",
    "statusJobbskifter",
    "behovForAttforing",
    "aktivitetsliste",
    "aksjonskode",
    "datoFra",
    "statusLegitimert"
})
public class PersonType {

    @XmlElement(name = "PersonId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger personId;
    @XmlElement(name = "Kandidatnummer")
    protected String kandidatnummer;
    @XmlElement(name = "Personalia", required = true)
    protected PersonaliaType personalia;
    @XmlElement(name = "Adresser", required = true, nillable = true)
    protected PersonType.Adresser adresser;
    @XmlElement(name = "Kommunikasjoner", required = true, nillable = true)
    protected PersonType.Kommunikasjoner kommunikasjoner;
    @XmlElement(name = "CV", required = true, nillable = true)
    protected CVType cv;
    @XmlElement(name = "CVLeddListe", required = true, nillable = true)
    protected PersonType.CVLeddListe cvLeddListe;
    @XmlElement(name = "Personprofil", required = true, nillable = true)
    protected PersonType.Personprofil personprofil;
    @XmlElement(name = "PersonforholdListe", required = true, nillable = true)
    protected PersonType.PersonforholdListe personforholdListe;
    @XmlElement(name = "Samtykke")
    protected SamtykkeType samtykke;
    @XmlElement(name = "StatusJobbskifter", required = true)
    protected String statusJobbskifter;
    @XmlElement(name = "BehovForAttforing")
    protected String behovForAttforing;
    @XmlElement(name = "Aktivitetsliste", required = true, nillable = true)
    protected PersonType.Aktivitetsliste aktivitetsliste;
    @XmlElement(name = "Aksjonskode")
    protected String aksjonskode;
    @XmlElementRef(name = "DatoFra", namespace = "http://www.aetat.no/arena/person.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datoFra;
    @XmlElement(name = "StatusLegitimert")
    protected String statusLegitimert;
    @XmlAttribute(name = "Id")
    protected String id;

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
     * Gets the value of the kandidatnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatnummer() {
        return kandidatnummer;
    }

    /**
     * Sets the value of the kandidatnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatnummer(String value) {
        this.kandidatnummer = value;
    }

    /**
     * Gets the value of the personalia property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaliaType }
     *     
     */
    public PersonaliaType getPersonalia() {
        return personalia;
    }

    /**
     * Sets the value of the personalia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaliaType }
     *     
     */
    public void setPersonalia(PersonaliaType value) {
        this.personalia = value;
    }

    /**
     * Gets the value of the adresser property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.Adresser }
     *     
     */
    public PersonType.Adresser getAdresser() {
        return adresser;
    }

    /**
     * Sets the value of the adresser property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.Adresser }
     *     
     */
    public void setAdresser(PersonType.Adresser value) {
        this.adresser = value;
    }

    /**
     * Gets the value of the kommunikasjoner property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.Kommunikasjoner }
     *     
     */
    public PersonType.Kommunikasjoner getKommunikasjoner() {
        return kommunikasjoner;
    }

    /**
     * Sets the value of the kommunikasjoner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.Kommunikasjoner }
     *     
     */
    public void setKommunikasjoner(PersonType.Kommunikasjoner value) {
        this.kommunikasjoner = value;
    }

    /**
     * Gets the value of the cv property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getCV() {
        return cv;
    }

    /**
     * Sets the value of the cv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setCV(CVType value) {
        this.cv = value;
    }

    /**
     * Gets the value of the cvLeddListe property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.CVLeddListe }
     *     
     */
    public PersonType.CVLeddListe getCVLeddListe() {
        return cvLeddListe;
    }

    /**
     * Sets the value of the cvLeddListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.CVLeddListe }
     *     
     */
    public void setCVLeddListe(PersonType.CVLeddListe value) {
        this.cvLeddListe = value;
    }

    /**
     * Gets the value of the personprofil property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.Personprofil }
     *     
     */
    public PersonType.Personprofil getPersonprofil() {
        return personprofil;
    }

    /**
     * Sets the value of the personprofil property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.Personprofil }
     *     
     */
    public void setPersonprofil(PersonType.Personprofil value) {
        this.personprofil = value;
    }

    /**
     * Gets the value of the personforholdListe property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.PersonforholdListe }
     *     
     */
    public PersonType.PersonforholdListe getPersonforholdListe() {
        return personforholdListe;
    }

    /**
     * Sets the value of the personforholdListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.PersonforholdListe }
     *     
     */
    public void setPersonforholdListe(PersonType.PersonforholdListe value) {
        this.personforholdListe = value;
    }

    /**
     * Gets the value of the samtykke property.
     * 
     * @return
     *     possible object is
     *     {@link SamtykkeType }
     *     
     */
    public SamtykkeType getSamtykke() {
        return samtykke;
    }

    /**
     * Sets the value of the samtykke property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamtykkeType }
     *     
     */
    public void setSamtykke(SamtykkeType value) {
        this.samtykke = value;
    }

    /**
     * Gets the value of the statusJobbskifter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusJobbskifter() {
        return statusJobbskifter;
    }

    /**
     * Sets the value of the statusJobbskifter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusJobbskifter(String value) {
        this.statusJobbskifter = value;
    }

    /**
     * Gets the value of the behovForAttforing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehovForAttforing() {
        return behovForAttforing;
    }

    /**
     * Sets the value of the behovForAttforing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehovForAttforing(String value) {
        this.behovForAttforing = value;
    }

    /**
     * Gets the value of the aktivitetsliste property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.Aktivitetsliste }
     *     
     */
    public PersonType.Aktivitetsliste getAktivitetsliste() {
        return aktivitetsliste;
    }

    /**
     * Sets the value of the aktivitetsliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.Aktivitetsliste }
     *     
     */
    public void setAktivitetsliste(PersonType.Aktivitetsliste value) {
        this.aktivitetsliste = value;
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

    /**
     * Gets the value of the datoFra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatoFra() {
        return datoFra;
    }

    /**
     * Sets the value of the datoFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatoFra(JAXBElement<XMLGregorianCalendar> value) {
        this.datoFra = value;
    }

    /**
     * Gets the value of the statusLegitimert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLegitimert() {
        return statusLegitimert;
    }

    /**
     * Sets the value of the statusLegitimert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLegitimert(String value) {
        this.statusLegitimert = value;
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

    public PersonType withPersonId(BigInteger value) {
        setPersonId(value);
        return this;
    }

    public PersonType withKandidatnummer(String value) {
        setKandidatnummer(value);
        return this;
    }

    public PersonType withPersonalia(PersonaliaType value) {
        setPersonalia(value);
        return this;
    }

    public PersonType withAdresser(PersonType.Adresser value) {
        setAdresser(value);
        return this;
    }

    public PersonType withKommunikasjoner(PersonType.Kommunikasjoner value) {
        setKommunikasjoner(value);
        return this;
    }

    public PersonType withCV(CVType value) {
        setCV(value);
        return this;
    }

    public PersonType withCVLeddListe(PersonType.CVLeddListe value) {
        setCVLeddListe(value);
        return this;
    }

    public PersonType withPersonprofil(PersonType.Personprofil value) {
        setPersonprofil(value);
        return this;
    }

    public PersonType withPersonforholdListe(PersonType.PersonforholdListe value) {
        setPersonforholdListe(value);
        return this;
    }

    public PersonType withSamtykke(SamtykkeType value) {
        setSamtykke(value);
        return this;
    }

    public PersonType withStatusJobbskifter(String value) {
        setStatusJobbskifter(value);
        return this;
    }

    public PersonType withBehovForAttforing(String value) {
        setBehovForAttforing(value);
        return this;
    }

    public PersonType withAktivitetsliste(PersonType.Aktivitetsliste value) {
        setAktivitetsliste(value);
        return this;
    }

    public PersonType withAksjonskode(String value) {
        setAksjonskode(value);
        return this;
    }

    public PersonType withDatoFra(JAXBElement<XMLGregorianCalendar> value) {
        setDatoFra(value);
        return this;
    }

    public PersonType withStatusLegitimert(String value) {
        setStatusLegitimert(value);
        return this;
    }

    public PersonType withId(String value) {
        setId(value);
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
     *         &lt;element name="Adresse" type="{http://www.aetat.no/arena/person.xsd}AdresseType" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<AdresseType> adresse;

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
         * {@link AdresseType }
         * 
         * 
         */
        public List<AdresseType> getAdresse() {
            if (adresse == null) {
                adresse = new ArrayList<AdresseType>();
            }
            return this.adresse;
        }

        public PersonType.Adresser withAdresse(AdresseType... values) {
            if (values!= null) {
                for (AdresseType value: values) {
                    getAdresse().add(value);
                }
            }
            return this;
        }

        public PersonType.Adresser withAdresse(Collection<AdresseType> values) {
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
     *         &lt;element name="Aktivitet" type="{http://www.aetat.no/arena/person.xsd}AktivitetType" maxOccurs="unbounded" minOccurs="0"/>
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
        "aktivitet"
    })
    public static class Aktivitetsliste {

        @XmlElement(name = "Aktivitet")
        protected List<AktivitetType> aktivitet;

        /**
         * Gets the value of the aktivitet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aktivitet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAktivitet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AktivitetType }
         * 
         * 
         */
        public List<AktivitetType> getAktivitet() {
            if (aktivitet == null) {
                aktivitet = new ArrayList<AktivitetType>();
            }
            return this.aktivitet;
        }

        public PersonType.Aktivitetsliste withAktivitet(AktivitetType... values) {
            if (values!= null) {
                for (AktivitetType value: values) {
                    getAktivitet().add(value);
                }
            }
            return this;
        }

        public PersonType.Aktivitetsliste withAktivitet(Collection<AktivitetType> values) {
            if (values!= null) {
                getAktivitet().addAll(values);
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
     *         &lt;element name="CVLedd" type="{http://www.aetat.no/arena/person.xsd}CVLeddType" maxOccurs="unbounded" minOccurs="0"/>
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
        "cvLedd"
    })
    public static class CVLeddListe {

        @XmlElement(name = "CVLedd")
        protected List<CVLeddType> cvLedd;

        /**
         * Gets the value of the cvLedd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cvLedd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCVLedd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CVLeddType }
         * 
         * 
         */
        public List<CVLeddType> getCVLedd() {
            if (cvLedd == null) {
                cvLedd = new ArrayList<CVLeddType>();
            }
            return this.cvLedd;
        }

        public PersonType.CVLeddListe withCVLedd(CVLeddType... values) {
            if (values!= null) {
                for (CVLeddType value: values) {
                    getCVLedd().add(value);
                }
            }
            return this;
        }

        public PersonType.CVLeddListe withCVLedd(Collection<CVLeddType> values) {
            if (values!= null) {
                getCVLedd().addAll(values);
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
     *         &lt;element name="Kommunikasjon" type="{http://www.aetat.no/arena/person.xsd}KommunikasjonType" maxOccurs="unbounded" minOccurs="0"/>
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

        public PersonType.Kommunikasjoner withKommunikasjon(KommunikasjonType... values) {
            if (values!= null) {
                for (KommunikasjonType value: values) {
                    getKommunikasjon().add(value);
                }
            }
            return this;
        }

        public PersonType.Kommunikasjoner withKommunikasjon(Collection<KommunikasjonType> values) {
            if (values!= null) {
                getKommunikasjon().addAll(values);
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
     *         &lt;element name="PersonForhold" type="{http://www.aetat.no/arena/person.xsd}PersonforholdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "personForhold"
    })
    public static class PersonforholdListe {

        @XmlElement(name = "PersonForhold")
        protected List<PersonforholdType> personForhold;

        /**
         * Gets the value of the personForhold property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personForhold property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonForhold().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonforholdType }
         * 
         * 
         */
        public List<PersonforholdType> getPersonForhold() {
            if (personForhold == null) {
                personForhold = new ArrayList<PersonforholdType>();
            }
            return this.personForhold;
        }

        public PersonType.PersonforholdListe withPersonForhold(PersonforholdType... values) {
            if (values!= null) {
                for (PersonforholdType value: values) {
                    getPersonForhold().add(value);
                }
            }
            return this;
        }

        public PersonType.PersonforholdListe withPersonForhold(Collection<PersonforholdType> values) {
            if (values!= null) {
                getPersonForhold().addAll(values);
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
     *         &lt;element name="Personprofilledd" type="{http://www.aetat.no/arena/person.xsd}PersonprofilLeddType" maxOccurs="unbounded" minOccurs="0"/>
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
        "personprofilledd"
    })
    public static class Personprofil {

        @XmlElement(name = "Personprofilledd")
        protected List<PersonprofilLeddType> personprofilledd;

        /**
         * Gets the value of the personprofilledd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personprofilledd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonprofilledd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonprofilLeddType }
         * 
         * 
         */
        public List<PersonprofilLeddType> getPersonprofilledd() {
            if (personprofilledd == null) {
                personprofilledd = new ArrayList<PersonprofilLeddType>();
            }
            return this.personprofilledd;
        }

        public PersonType.Personprofil withPersonprofilledd(PersonprofilLeddType... values) {
            if (values!= null) {
                for (PersonprofilLeddType value: values) {
                    getPersonprofilledd().add(value);
                }
            }
            return this;
        }

        public PersonType.Personprofil withPersonprofilledd(Collection<PersonprofilLeddType> values) {
            if (values!= null) {
                getPersonprofilledd().addAll(values);
            }
            return this;
        }

    }

}
