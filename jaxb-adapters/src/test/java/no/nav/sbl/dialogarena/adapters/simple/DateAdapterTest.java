package no.nav.sbl.dialogarena.adapters.simple;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class DateAdapterTest {

    @Test
    public void unmarshalYearhMonthDay() {
        String dateString = "2014-10-09";
        DateTime dateTime = DateAdapter.unmarshal(dateString);
        assertThat(dateTime.getYear(), is(2014));
        assertThat(dateTime.getMonthOfYear(), is(10));
        assertThat(dateTime.getDayOfMonth(), is(9));
    }

    @Test
    public void unmarshalYearhMonthDayWithHourMinute() {
        String dateString = "2014-10-09+02:03";
        DateTime dateTime = DateAdapter.unmarshal(dateString);
        assertThat(dateTime.getYear(), is(2014));
        assertThat(dateTime.getMonthOfYear(), is(10));
        assertThat(dateTime.getDayOfMonth(), is(9));
        assertThat(dateTime.getHourOfDay(), is(2));
        assertThat(dateTime.getMinuteOfHour(), is(3));
    }

    @Test
    public void unmarshalYearhMonthDayWithZulu() {
        String dateString = "2014-10-09Z";
        DateTime dateTime = DateAdapter.unmarshal(dateString);
        assertThat(dateTime.getYear(), is(2014));
        assertThat(dateTime.getMonthOfYear(), is(10));
        assertThat(dateTime.getDayOfMonth(), is(9));
    }

    @Test
    public void marshalYearhMonthDay() {
        DateTime dateTime = new DateTime(2014, 10, 9, 0, 0);
        String dateString = DateAdapter.marshal(dateTime);
        assertThat(dateString, is("2014-10-09+00:00"));
    }

    @Test
    public void marshalYearhMonthDayWithHourMinute() {
        DateTime dateTime = new DateTime(2014, 10, 9, 1, 2);
        String dateString = DateAdapter.marshal(dateTime);
        assertThat(dateString, is("2014-10-09+01:02"));
    }
}