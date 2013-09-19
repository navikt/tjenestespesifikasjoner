package no.nav.sbl.dialogarena.kodeverk.adapters;

import org.joda.time.DateMidnight;
import org.joda.time.format.ISODateTimeFormat;

public class DateAdapter {
    public static DateMidnight unmarshal(String v)  {
        if (v.contains("+")) {
            return new DateMidnight(v.substring(0, v.indexOf('+')));
        }
        return new DateMidnight(v);
    }

    public static String marshal(DateMidnight v) {
        return v.toString(ISODateTimeFormat.date());
    }
}
