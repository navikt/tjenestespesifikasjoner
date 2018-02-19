package no.nav.sbl.dialogarena.adapters.simple;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static javax.xml.bind.DatatypeConverter.parseDate;

public class CalendarAdapter extends XmlAdapter<String, Calendar> {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public Calendar unmarshal(String dateString) throws Exception {
        return parseDate(dateString);
    }

    @Override
    public String marshal(Calendar calendar) throws Exception {
        if (calendar == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(calendar.getTime());
    }
}
