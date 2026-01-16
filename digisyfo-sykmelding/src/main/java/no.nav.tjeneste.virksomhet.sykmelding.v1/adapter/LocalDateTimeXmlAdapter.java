package no.nav.tjeneste.virksomhet.sykmelding.v1.adapter;

import io.github.threetenjaxb.core.TemporalAccessorXmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeXmlAdapter extends TemporalAccessorXmlAdapter<LocalDateTime> {
    public LocalDateTimeXmlAdapter() {
        super(DateTimeFormatter.ISO_DATE_TIME, LocalDateTime::from);
    }
}