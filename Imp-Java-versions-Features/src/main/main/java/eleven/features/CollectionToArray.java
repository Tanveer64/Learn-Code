package eleven.features;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tanveer", "Ali", "Asad");
        for (String n : names) {
            System.out.println(n);
        }
        String[] nameArray = names.toArray(String[]::new);
        for (String n : nameArray) {
            System.out.println("Array:" + n);
        }
    }
}
