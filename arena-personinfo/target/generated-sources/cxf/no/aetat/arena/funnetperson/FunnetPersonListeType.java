
package no.aetat.arena.funnetperson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunnetPersonListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunnetPersonListeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunnetPerson" type="{http://www.aetat.no/arena/funnetperson.xsd}FunnetPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunnetPersonListeType", propOrder = {
    "funnetPerson"
})
@XmlSeeAlso({
    FunnetPersonListe.class
})
public class FunnetPersonListeType {

    @XmlElement(name = "FunnetPerson")
    protected List<FunnetPersonType> funnetPerson;

    /**
     * Gets the value of the funnetPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funnetPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunnetPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunnetPersonType }
     * 
     * 
     */
    public List<FunnetPersonType> getFunnetPerson() {
        if (funnetPerson == null) {
            funnetPerson = new ArrayList<FunnetPersonType>();
        }
        return this.funnetPerson;
    }

    public FunnetPersonListeType withFunnetPerson(FunnetPersonType... values) {
        if (values!= null) {
            for (FunnetPersonType value: values) {
                getFunnetPerson().add(value);
            }
        }
        return this;
    }

    public FunnetPersonListeType withFunnetPerson(Collection<FunnetPersonType> values) {
        if (values!= null) {
            getFunnetPerson().addAll(values);
        }
        return this;
    }

}
