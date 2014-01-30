
package no.nav.arena.services.lib.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.arena.services.lib.fault package. 
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

    private final static QName _FaultFeilIInput_QNAME = new QName("http://arena.nav.no/services/lib/fault", "faultFeilIInput");
    private final static QName _FaultGenerisk_QNAME = new QName("http://arena.nav.no/services/lib/fault", "faultGenerisk");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.arena.services.lib.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultFeilIInput }
     * 
     */
    public FaultFeilIInput createFaultFeilIInput() {
        return new FaultFeilIInput();
    }

    /**
     * Create an instance of {@link FaultGenerisk }
     * 
     */
    public FaultGenerisk createFaultGenerisk() {
        return new FaultGenerisk();
    }

    /**
     * Create an instance of {@link FaultBase }
     * 
     */
    public FaultBase createFaultBase() {
        return new FaultBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultFeilIInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arena.nav.no/services/lib/fault", name = "faultFeilIInput")
    public JAXBElement<FaultFeilIInput> createFaultFeilIInput(FaultFeilIInput value) {
        return new JAXBElement<FaultFeilIInput>(_FaultFeilIInput_QNAME, FaultFeilIInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultGenerisk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arena.nav.no/services/lib/fault", name = "faultGenerisk")
    public JAXBElement<FaultGenerisk> createFaultGenerisk(FaultGenerisk value) {
        return new JAXBElement<FaultGenerisk>(_FaultGenerisk_QNAME, FaultGenerisk.class, null, value);
    }

}
