package no.nav.sbl.dialogarena.kodeverk.adapters;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeAdapter {
    public static DateTime unmarshal(String v)  {
        if (v.contains("+")) {
            return new DateTime(v.substring(0, v.indexOf('+')));
        }
        return new DateTime(v);
    }

    public static String marshal(DateTime v) {
        return v.toLocalDateTime().toString(ISODateTimeFormat.dateTime());
    }
}
