package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tanveer", " ", "Ali", "");
        list.forEach(name -> System.out.println(name));

       List<String> list1WithoutBlanks =  list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
      list1WithoutBlanks.forEach(System.out::println);

    }
}
