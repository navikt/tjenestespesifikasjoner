
package no.aetat.arena.person;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.aetat.arena.person package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("http://www.aetat.no/arena/person.xsd", "Person");
    private final static QName _PersonTypeDatoFra_QNAME = new QName("http://www.aetat.no/arena/person.xsd", "DatoFra");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.aetat.arena.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link CVType }
     * 
     */
    public CVType createCVType() {
        return new CVType();
    }

    /**
     * Create an instance of {@link AdresseType }
     * 
     */
    public AdresseType createAdresseType() {
        return new AdresseType();
    }

    /**
     * Create an instance of {@link AktivitetType }
     * 
     */
    public AktivitetType createAktivitetType() {
        return new AktivitetType();
    }

    /**
     * Create an instance of {@link KommunikasjonType }
     * 
     */
    public KommunikasjonType createKommunikasjonType() {
        return new KommunikasjonType();
    }

    /**
     * Create an instance of {@link CVLeddType }
     * 
     */
    public CVLeddType createCVLeddType() {
        return new CVLeddType();
    }

    /**
     * Create an instance of {@link PersonaliaType }
     * 
     */
    public PersonaliaType createPersonaliaType() {
        return new PersonaliaType();
    }

    /**
     * Create an instance of {@link PersonprofilLeddType }
     * 
     */
    public PersonprofilLeddType createPersonprofilLeddType() {
        return new PersonprofilLeddType();
    }

    /**
     * Create an instance of {@link PersonforholdType }
     * 
     */
    public PersonforholdType createPersonforholdType() {
        return new PersonforholdType();
    }

    /**
     * Create an instance of {@link SamtykkeType }
     * 
     */
    public SamtykkeType createSamtykkeType() {
        return new SamtykkeType();
    }

    /**
     * Create an instance of {@link PersonType.Adresser }
     * 
     */
    public PersonType.Adresser createPersonTypeAdresser() {
        return new PersonType.Adresser();
    }

    /**
     * Create an instance of {@link PersonType.Kommunikasjoner }
     * 
     */
    public PersonType.Kommunikasjoner createPersonTypeKommunikasjoner() {
        return new PersonType.Kommunikasjoner();
    }

    /**
     * Create an instance of {@link PersonType.CVLeddListe }
     * 
     */
    public PersonType.CVLeddListe createPersonTypeCVLeddListe() {
        return new PersonType.CVLeddListe();
    }

    /**
     * Create an instance of {@link PersonType.Personprofil }
     * 
     */
    public PersonType.Personprofil createPersonTypePersonprofil() {
        return new PersonType.Personprofil();
    }

    /**
     * Create an instance of {@link PersonType.PersonforholdListe }
     * 
     */
    public PersonType.PersonforholdListe createPersonTypePersonforholdListe() {
        return new PersonType.PersonforholdListe();
    }

    /**
     * Create an instance of {@link PersonType.Aktivitetsliste }
     * 
     */
    public PersonType.Aktivitetsliste createPersonTypeAktivitetsliste() {
        return new PersonType.Aktivitetsliste();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aetat.no/arena/person.xsd", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aetat.no/arena/person.xsd", name = "DatoFra", scope = PersonType.class)
    public JAXBElement<XMLGregorianCalendar> createPersonTypeDatoFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonTypeDatoFra_QNAME, XMLGregorianCalendar.class, PersonType.class, value);
    }

}
