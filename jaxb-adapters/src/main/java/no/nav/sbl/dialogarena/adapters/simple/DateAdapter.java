package no.nav.sbl.dialogarena.adapters.simple;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;

public class DateAdapter {

    private static final String DATE_FORMAT = "yyyy-MM-dd+HH:mm";

    public static DateTime unmarshal(String v) {
        if(v.contains("Z")) {
            return new DateTime(v.substring(0, v.indexOf('Z')));
        } else if(v.contains("+")) {
            int idx = v.indexOf("+");
            int hour = Integer.valueOf(v.substring(idx + 1, idx + 3));
            int minute = Integer.valueOf(v.substring(idx + 4, idx + 6));

            return new DateTime(v.substring(0, v.indexOf('+')))
                    .withHourOfDay(hour)
                    .withMinuteOfHour(minute);
        }

        return new DateTime(v);
    }

    public static String marshal(DateTime v) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(v.toDate());
    }
}