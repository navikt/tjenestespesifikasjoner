
package no.nav.arena.services.lib.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultFeilIInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultFeilIInput">
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
@XmlType(name = "FaultFeilIInput")
public class FaultFeilIInput
    extends FaultBase
{


    @Override
    public FaultFeilIInput withErrorMessage(String value) {
        setErrorMessage(value);
        return this;
    }

    @Override
    public FaultFeilIInput withErrorSource(String value) {
        setErrorSource(value);
        return this;
    }

    @Override
    public FaultFeilIInput withErrorType(String value) {
        setErrorType(value);
        return this;
    }

    @Override
    public FaultFeilIInput withRootCause(String value) {
        setRootCause(value);
        return this;
    }

    @Override
    public FaultFeilIInput withDateTimeStamp(String value) {
        setDateTimeStamp(value);
        return this;
    }

}
