import java.util.Calendar;
import java.util.GregorianCalendar;

public enum Holidays {
    BIRTHDAY(1993, 11, 2),
    NEWYEAR2020(2020, 0, 1);

    Calendar calendar;

    Holidays(int year, int month, int days) {
        this.calendar = new GregorianCalendar(year, month, days);
    }

    public Calendar getCalendar() {
        return calendar;
    }
}
