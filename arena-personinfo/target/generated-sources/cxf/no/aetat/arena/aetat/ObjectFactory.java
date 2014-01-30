
package no.aetat.arena.aetat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.aetat.arena.aetat package. 
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

    private final static QName _Aetat_QNAME = new QName("http://www.aetat.no/arena/aetat.xsd", "Aetat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.aetat.arena.aetat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AetatType }
     * 
     */
    public AetatType createAetatType() {
        return new AetatType();
    }

    /**
     * Create an instance of {@link KommunikasjonType }
     * 
     */
    public KommunikasjonType createKommunikasjonType() {
        return new KommunikasjonType();
    }

    /**
     * Create an instance of {@link AetatAdresseType }
     * 
     */
    public AetatAdresseType createAetatAdresseType() {
        return new AetatAdresseType();
    }

    /**
     * Create an instance of {@link AetatType.Adresser }
     * 
     */
    public AetatType.Adresser createAetatTypeAdresser() {
        return new AetatType.Adresser();
    }

    /**
     * Create an instance of {@link AetatType.Kommunikasjoner }
     * 
     */
    public AetatType.Kommunikasjoner createAetatTypeKommunikasjoner() {
        return new AetatType.Kommunikasjoner();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AetatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aetat.no/arena/aetat.xsd", name = "Aetat")
    public JAXBElement<AetatType> createAetat(AetatType value) {
        return new JAXBElement<AetatType>(_Aetat_QNAME, AetatType.class, null, value);
    }

}
