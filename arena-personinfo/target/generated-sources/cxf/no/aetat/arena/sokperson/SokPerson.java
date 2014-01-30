
package no.aetat.arena.sokperson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aetat.no/arena/sokperson.xsd}SokPersonType">
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SokPerson")
public class SokPerson
    extends SokPersonType
{

    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public SokPerson withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public SokPerson withFornavn(String value) {
        setFornavn(value);
        return this;
    }

    @Override
    public SokPerson withEtternavn(String value) {
        setEtternavn(value);
        return this;
    }

    @Override
    public SokPerson withFodselsdato(XMLGregorianCalendar value) {
        setFodselsdato(value);
        return this;
    }

}
