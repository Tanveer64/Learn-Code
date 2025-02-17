package twelve.features;

import java.util.Locale;

public class AddedStringMethods {
    public static void main(String[] args)
    {
        /* String intend function positive value add space in beginning of each line
         and negative value remove space */

        String text = "java\nis\na\nlanguage";
        String intendAddSpace = text.indent(4); // add space in beginning of each line
        String intendRemoveSPace = text.indent(-2); // remove space in beginning of each line
        System.out.println("text: \n" + text);
        System.out.println("intendAddSpace" + intendAddSpace);
        System.out.println("intendRemoveSpace" + intendRemoveSPace);

        // String transformation Method allows channing transformation for String and used for string manipulation

        String textTransformation = "Java 12 features";

        String transformedText = textTransformation.transform(s -> s.toUpperCase(Locale.ROOT) + " String Transformation");
        System.out.println("transformedText = " + transformedText);

    }
}
