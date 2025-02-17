package fifteen.features;

public class TextBlockFeature {
    /*
    This feature allows developers to write multi-line string literals in a more readable and convenient format.
    This can make it easier to write and maintain code that uses large strings, such as JSON or HTML.
    This feature eliminates
     the need to escape characters and concatenate string lines. Below is an example of the above feature:
    */
    public static void main(String[] args){
        String html = """
                <html>
                <body>
                <p>text block example</p>
                </body>
                </html>
                """;
        System.out.println(" Html String print \n" + html);

    }}
