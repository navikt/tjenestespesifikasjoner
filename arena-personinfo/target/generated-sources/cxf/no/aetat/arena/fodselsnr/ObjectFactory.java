
package no.aetat.arena.fodselsnr;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.aetat.arena.fodselsnr package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.aetat.arena.fodselsnr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fodselsnr }
     * 
     */
    public Fodselsnr createFodselsnr() {
        return new Fodselsnr();
    }

    /**
     * Create an instance of {@link FodselsnrType }
     * 
     */
    public FodselsnrType createFodselsnrType() {
        return new FodselsnrType();
    }

}
