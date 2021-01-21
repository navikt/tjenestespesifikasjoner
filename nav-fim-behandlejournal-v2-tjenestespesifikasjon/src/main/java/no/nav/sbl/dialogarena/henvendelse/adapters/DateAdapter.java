package no.nav.sbl.dialogarena.henvendelse.adapters;

import org.joda.time.DateMidnight;
import org.joda.time.format.ISODateTimeFormat;

public class DateAdapter {
    public static DateMidnight unmarshal(String v) {
        return new DateMidnight(v);
    }

    public static String marshal(DateMidnight v) {
        return v.toString(ISODateTimeFormat.date());
    }
}
