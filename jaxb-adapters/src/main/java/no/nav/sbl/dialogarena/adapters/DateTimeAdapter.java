package no.nav.sbl.dialogarena.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;

public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

    public DateTime unmarshal(String value) {
    	return new DateTime(value);
    }

    public String marshal(DateTime value) {
        return value.toString();
    }

}
