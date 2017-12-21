package no.nav.sbl.dialogarena.adapters.simple;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static javax.xml.bind.DatatypeConverter.parseDate;

public class CalendarAdapter extends XmlAdapter<String, Calendar> {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public Calendar unmarshal(String v) throws Exception {
        return parseDate(v);
    }

    @Override
    public String marshal(Calendar v) throws Exception {
        if (v == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(v.getTime());
    }
}
