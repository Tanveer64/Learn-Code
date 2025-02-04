package org.example;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternMatchMethod {
    public static void main(String[] args) {
        Predicate h = Pattern.compile("abc").asMatchPredicate();
        System.out.println(h.test("aabc"));
        System.out.println(h.test("abc"));

    }
}
