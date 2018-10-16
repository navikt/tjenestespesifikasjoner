package no.nav.tjeneste.virksomhet.sykmelding.v1.adapter;

import com.migesok.jaxb.adapter.javatime.TemporalAccessorXmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeXmlAdapter extends TemporalAccessorXmlAdapter<LocalDateTime> {
    public LocalDateTimeXmlAdapter() {
        super(DateTimeFormatter.ISO_DATE_TIME, LocalDateTime::from);
    }
}