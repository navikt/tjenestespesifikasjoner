package no.nav.sbl.dialogarena.adapters.utbetaling;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UtbetalingDateAdapter extends XmlAdapter<String, DateTime>{

    public DateTime unmarshal(String v)  {
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

    public String marshal(DateTime v) {
        return v.toLocalDateTime().toString(ISODateTimeFormat.date());
    }
}