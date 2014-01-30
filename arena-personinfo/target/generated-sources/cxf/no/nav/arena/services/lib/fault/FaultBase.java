
package no.nav.arena.services.lib.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rootCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultBase", propOrder = {
    "errorMessage",
    "errorSource",
    "errorType",
    "rootCause",
    "dateTimeStamp"
})
@XmlSeeAlso({
    FaultFeilIInput.class,
    FaultGenerisk.class
})
public class FaultBase {

    protected String errorMessage;
    protected String errorSource;
    protected String errorType;
    protected String rootCause;
    protected String dateTimeStamp;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSource() {
        return errorSource;
    }

    /**
     * Sets the value of the errorSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSource(String value) {
        this.errorSource = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the rootCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCause() {
        return rootCause;
    }

    /**
     * Sets the value of the rootCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCause(String value) {
        this.rootCause = value;
    }

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeStamp(String value) {
        this.dateTimeStamp = value;
    }

    public FaultBase withErrorMessage(String value) {
        setErrorMessage(value);
        return this;
    }

    public FaultBase withErrorSource(String value) {
        setErrorSource(value);
        return this;
    }

    public FaultBase withErrorType(String value) {
        setErrorType(value);
        return this;
    }

    public FaultBase withRootCause(String value) {
        setRootCause(value);
        return this;
    }

    public FaultBase withDateTimeStamp(String value) {
        setDateTimeStamp(value);
        return this;
    }

}
