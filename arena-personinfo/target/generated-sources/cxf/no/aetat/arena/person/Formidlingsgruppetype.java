
package no.aetat.arena.person;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Formidlingsgruppetype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Formidlingsgruppetype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARBS"/>
 *     &lt;enumeration value="PARBS"/>
 *     &lt;enumeration value="RARBS"/>
 *     &lt;enumeration value="ISERV"/>
 *     &lt;enumeration value="JOBBS"/>
 *     &lt;enumeration value="IJOBS"/>
 *     &lt;enumeration value="IARBS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Formidlingsgruppetype")
@XmlEnum
public enum Formidlingsgruppetype {

    ARBS,
    PARBS,
    RARBS,
    ISERV,
    JOBBS,
    IJOBS,
    IARBS;

    public String value() {
        return name();
    }

    public static Formidlingsgruppetype fromValue(String v) {
        return valueOf(v);
    }

}
