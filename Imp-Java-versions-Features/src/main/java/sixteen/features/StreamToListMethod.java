package sixteen.features;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListMethod {
    public static void main(String[] args) {
        Stream.of("tanveet", "asad", "ali").collect(Collectors.toList());
        //unmodifiable list
        Stream.of("tanveer", "abrar", "test").collect(Collectors.toUnmodifiableList());
        //Linked list:
        Stream.of("tanveer", "talha", "Matiullah").collect(Collectors.toCollection(LinkedHashSet::new));

        // New Method Stream

        List<String> list = Stream.of("tanveer", "ali", "Mujtaba").toList();

        list.forEach(System.out::println);
    }

}
