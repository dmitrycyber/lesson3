import java.time.LocalDate;

public enum Holidays2 {
    BIRTHDAY(1993, 12, 2),
    NEWYEAR2020(2020, 1, 1),
    TODAY(2019, 10, 31),
    TOMORROW (2019, 11, 1),
    YESTERDAY (2019, 10, 30);

    LocalDate date;

    Holidays2(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public LocalDate getDate() {
        return date;
    }



}
