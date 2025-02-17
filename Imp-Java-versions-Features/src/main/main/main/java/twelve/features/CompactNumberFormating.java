package twelve.features;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormating {
    public static void main(String[] args) {
        /*
        Java 12 introduces support for compact number formatting in the NumberFormat class, allowing numbers to be formatted in a more readable
        and concise way. This feature is particularly useful for displaying large numbers in a user-friendly format.
        */
        int number = 1234565;

        NumberFormat numberFormatUS = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat numberFormatIndia = NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"), NumberFormat.Style.SHORT);
        System.out.println("US Compact Format:" + numberFormatUS.format(number));
        System.out.println("India compact formate: " + numberFormatIndia.format(number));

               /*
        Explanation
        Locale-Specific: The getCompactNumberInstance() method returns a NumberFormat instance for compact number
        formatting, with results tailored to the specified locale.
        Readability: Compact number formatting improves the readability of large numbers by using abbreviations,
        such as "M" for millions and "L" for lakhs.
        */
    }
}
