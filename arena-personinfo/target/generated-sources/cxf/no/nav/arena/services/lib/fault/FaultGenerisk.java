
package no.nav.arena.services.lib.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultGenerisk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultGenerisk">
 *   &lt;complexContent>
 *     &lt;extension base="{http://arena.nav.no/services/lib/fault}FaultBase">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultGenerisk")
public class FaultGenerisk
    extends FaultBase
{


    @Override
    public FaultGenerisk withErrorMessage(String value) {
        setErrorMessage(value);
        return this;
    }

    @Override
    public FaultGenerisk withErrorSource(String value) {
        setErrorSource(value);
        return this;
    }

    @Override
    public FaultGenerisk withErrorType(String value) {
        setErrorType(value);
        return this;
    }

    @Override
    public FaultGenerisk withRootCause(String value) {
        setRootCause(value);
        return this;
    }

    @Override
    public FaultGenerisk withDateTimeStamp(String value) {
        setDateTimeStamp(value);
        return this;
    }

}
