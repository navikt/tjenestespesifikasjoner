//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.28 at 08:35:22 AM CET 
//


package no.nav.melding.domene.brukerdialog.behandlingsinformasjon.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://nav.no/melding/domene/brukerdialog/behandlingsinformasjon/v1}behandlingsinformasjon"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "behandlingsinformasjon"
})
@XmlRootElement(name = "startBehandling")
public class StartBehandling {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(namespace = "http://nav.no/melding/domene/brukerdialog/behandlingsinformasjon/v1", required = true)
    protected Behandlingsinformasjon behandlingsinformasjon;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the behandlingsinformasjon property.
     * 
     * @return
     *     possible object is
     *     {@link Behandlingsinformasjon }
     *     
     */
    public Behandlingsinformasjon getBehandlingsinformasjon() {
        return behandlingsinformasjon;
    }

    /**
     * Sets the value of the behandlingsinformasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandlingsinformasjon }
     *     
     */
    public void setBehandlingsinformasjon(Behandlingsinformasjon value) {
        this.behandlingsinformasjon = value;
    }

}
