package eleven.features;

import java.util.stream.Stream;

public class LocalVariable {
    public static void main(String[] args){
        // with var variable lambda expression
        Stream.of("tanveer","ali","asad").map((var name)->name.toUpperCase()).forEach(System.out::println);
        //without var variable
        Stream.of(1,2,5,4).filter(i-> i%2 == 0).forEach(System.out::println);
    }
}
