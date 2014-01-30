
package no.aetat.arena.adresse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.aetat.arena.adresse package. 
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

    private final static QName _Adresse_QNAME = new QName("http://www.aetat.no/arena/adresse.xsd", "Adresse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.aetat.arena.adresse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KontorAdresseType }
     * 
     */
    public KontorAdresseType createKontorAdresseType() {
        return new KontorAdresseType();
    }

    /**
     * Create an instance of {@link GateAdresseType }
     * 
     */
    public GateAdresseType createGateAdresseType() {
        return new GateAdresseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontorAdresseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aetat.no/arena/adresse.xsd", name = "Adresse")
    public JAXBElement<KontorAdresseType> createAdresse(KontorAdresseType value) {
        return new JAXBElement<KontorAdresseType>(_Adresse_QNAME, KontorAdresseType.class, null, value);
    }

}
