package eleven.features;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitConvertMethod {
    public static void main(String[] args) {
        // Using TimeUnit class’ convert method, we can change time to Days, Months, Years etc.
        // Consider below example

        TimeUnit timeConversion = TimeUnit.DAYS;
        int noOfHours = 90;
        long days = timeConversion.convert(Duration.ofHours(noOfHours));
        System.out.println("Number of Days = " + days);
        TimeUnit timeConVersionMonth = TimeUnit.HOURS;
        long hours = timeConVersionMonth.convert(Duration.ofDays(2));
        System.out.println("Hours=" + hours);
    }
}
