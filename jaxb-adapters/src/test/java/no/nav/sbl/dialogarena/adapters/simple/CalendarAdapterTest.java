package no.nav.sbl.dialogarena.adapters.simple;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class CalendarAdapterTest {
    private CalendarAdapter calendarAdapter = new CalendarAdapter();

    @Test
    public void unmarshalYearMonthDay() throws Exception {
        String dateString = "2017-12-19";
        Calendar calendar = calendarAdapter.unmarshal(dateString);

        assertThat(calendar, notNullValue());
        assertThat(calendar.get(Calendar.YEAR), is(2017));
        // fordi januar er 0 i Java Calendar...
        assertThat(calendar.get(Calendar.MONTH) + 1, is(12));
        assertThat(calendar.get(Calendar.DAY_OF_MONTH), is(19));

    }

    @Test
    public void marshalYearhMonthDay() throws Exception {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2017, 11, 19);

        String dateString = calendarAdapter.marshal(gregorianCalendar);

        assertThat(dateString, is("2017-12-19"));
    }
}