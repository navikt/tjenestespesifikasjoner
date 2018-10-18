package no.nav.sbl.dialogarena.adapters.utbetaling;

import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UtbetalingDateAdapterTest {

    private static UtbetalingDateAdapter adapter;

    @BeforeClass
    public static void setUp() {
        adapter = new UtbetalingDateAdapter();
    }

    @Test
    public void unmarshalDateZulu() {
        String dateString = "2010-01-02Z";
        DateTime dateTime = adapter.unmarshal(dateString);

        assertThat(dateTime.getYear(), is(2010));
        assertThat(dateTime.getMonthOfYear(), is(1));
        assertThat(dateTime.getDayOfMonth(), is(2));
    }

    @Test
    public void unmarshalDateWithTime() {
        String dateString = "2010-01-02+03:04";
        DateTime dateTime = adapter.unmarshal(dateString);

        assertThat(dateTime.getYear(), is(2010));
        assertThat(dateTime.getMonthOfYear(), is(1));
        assertThat(dateTime.getDayOfMonth(), is(2));
        assertThat(dateTime.getHourOfDay(), is(3));
        assertThat(dateTime.getMinuteOfHour(), is(4));
    }

    @Test
    public void unmarshalDate() {
        String dateString = "2010-01-02";
        DateTime dateTime = adapter.unmarshal(dateString);

        assertThat(dateTime.getYear(), is(2010));
        assertThat(dateTime.getMonthOfYear(), is(1));
        assertThat(dateTime.getDayOfMonth(), is(2));
    }

    @Test
    public void marshal() {
        DateTime dateTime = new DateTime(2010, 01, 02, 03, 04);
        String dateString = adapter.marshal(dateTime);

        assertThat(dateString, is("2010-01-02"));
    }

}