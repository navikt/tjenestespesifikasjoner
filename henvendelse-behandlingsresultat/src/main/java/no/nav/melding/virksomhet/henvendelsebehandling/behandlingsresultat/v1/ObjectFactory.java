//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.18 at 04:46:59 PM CEST 
//


package no.nav.melding.virksomhet.henvendelsebehandling.behandlingsresultat.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.melding.virksomhet.henvendelsebehandling.behandlingsresultat.v1 package. 
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

    private final static QName _Henvendelse_QNAME = new QName("http://nav.no/melding/virksomhet/henvendelsebehandling/behandlingsresultat/v1", "henvendelse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.melding.virksomhet.henvendelsebehandling.behandlingsresultat.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XMLSuperwrapper }
     * 
     */
    public XMLSuperwrapper createXMLSuperwrapper() {
        return new XMLSuperwrapper();
    }

    /**
     * Create an instance of {@link XMLHenvendelse }
     * 
     */
    public XMLHenvendelse createXMLHenvendelse() {
        return new XMLHenvendelse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLHenvendelse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/melding/virksomhet/henvendelsebehandling/behandlingsresultat/v1", name = "henvendelse")
    public JAXBElement<XMLHenvendelse> createHenvendelse(XMLHenvendelse value) {
        return new JAXBElement<XMLHenvendelse>(_Henvendelse_QNAME, XMLHenvendelse.class, null, value);
    }

}
