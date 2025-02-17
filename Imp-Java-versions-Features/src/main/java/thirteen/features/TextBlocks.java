package thirteen.features;

public class TextBlocks {
    public static void main(String[] args){

        // before java 13

        String html ="<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";

       // in Java 13


        String html13 =  """
                <html>
                    <body>
                        <p>Hello, World</p>
                    </body>
                </html>
				        """;

        String json = """
                {
                    "name":"mkyong",
                    "age":38
                }
                """;

    }
}
