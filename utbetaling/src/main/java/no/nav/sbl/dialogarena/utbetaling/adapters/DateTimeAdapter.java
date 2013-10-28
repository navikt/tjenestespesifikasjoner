package no.nav.sbl.dialogarena.utbetaling.adapters;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class DateTimeAdapter {

        public static DateTime unmarshal(String v) {
            return new DateTime(v);
        }

        public static String marshal(DateTime v) {
            return v.toString();
        }
//
//    public static LocalDate unmarshal(String v) {
//        return new LocalDate(v);
//    }
//
//    public static String marshal(LocalDate v) {
//        return v.toString();
//    }


}
