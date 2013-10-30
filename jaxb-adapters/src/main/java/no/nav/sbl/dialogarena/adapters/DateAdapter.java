package no.nav.sbl.dialogarena.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

	public LocalDate unmarshal(String v) {
		if (v.contains("+")) {
			return new LocalDate(v.substring(0, v.indexOf('+')));
		}
		return new LocalDate(v);
	}

	public String marshal(LocalDate v) {
		return v != null ? v.toString(ISODateTimeFormat.date()) : null;
	}

}
