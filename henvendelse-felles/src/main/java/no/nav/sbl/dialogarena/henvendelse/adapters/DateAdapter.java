package no.nav.sbl.dialogarena.henvendelse.adapters;

import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

public class DateAdapter {
    public static LocalDate unmarshal(String v)  {
        if (v.contains("+")) {
            return new LocalDate(v.substring(0, v.indexOf('+')));
        }
        return new LocalDate(v);
    }

    public static String marshal(LocalDate v) {
        return v != null ? v.toString(ISODateTimeFormat.date()) : null;
    }
}