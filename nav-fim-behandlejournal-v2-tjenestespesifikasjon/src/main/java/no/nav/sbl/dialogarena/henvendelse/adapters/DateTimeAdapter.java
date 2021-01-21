package no.nav.sbl.dialogarena.henvendelse.adapters;

import org.joda.time.DateTime;

public class DateTimeAdapter {
    public static DateTime unmarshal(String v)  {
        return new DateTime(v);
    }

    public static String marshal(DateTime v) {
        return v.toString();
    }
}