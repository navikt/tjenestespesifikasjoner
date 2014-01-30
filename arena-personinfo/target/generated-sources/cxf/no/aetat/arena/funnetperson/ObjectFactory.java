
package no.aetat.arena.funnetperson;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.aetat.arena.funnetperson package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.aetat.arena.funnetperson
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FunnetPersonListe }
     * 
     */
    public FunnetPersonListe createFunnetPersonListe() {
        return new FunnetPersonListe();
    }

    /**
     * Create an instance of {@link FunnetPersonListeType }
     * 
     */
    public FunnetPersonListeType createFunnetPersonListeType() {
        return new FunnetPersonListeType();
    }

    /**
     * Create an instance of {@link FunnetPersonType }
     * 
     */
    public FunnetPersonType createFunnetPersonType() {
        return new FunnetPersonType();
    }

}
