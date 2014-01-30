
package no.aetat.arena.funnetperson;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.aetat.no/arena/funnetperson.xsd}FunnetPersonListeType">
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FunnetPersonListe")
public class FunnetPersonListe
    extends FunnetPersonListeType
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
        if (id == null) {
            return "1";
        } else {
            return id;
        }
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

    public FunnetPersonListe withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public FunnetPersonListe withFunnetPerson(FunnetPersonType... values) {
        if (values!= null) {
            for (FunnetPersonType value: values) {
                getFunnetPerson().add(value);
            }
        }
        return this;
    }

    @Override
    public FunnetPersonListe withFunnetPerson(Collection<FunnetPersonType> values) {
        if (values!= null) {
            getFunnetPerson().addAll(values);
        }
        return this;
    }

}
