package org.example;

import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaElevenStringFunctions {
    public static void main(String[] args) {
        String s2 = "";
        System.out.println(s2.isBlank());
        String s3 = "heloo";
        System.out.println(s3.isBlank());
        String s4 = "heloo\ntanveer\nhow\nhow\nare\nyou";
        System.out.print(s4.lines().collect(Collectors.toList()));
        System.out.println(s3.repeat(5));
        String stripLeading = "  hello Tanveer";
        System.out.println(stripLeading.stripLeading());
        String stripTrailling = "Remove space from End of String ";
        System.out.println(stripTrailling.stripTrailing());
        String strip  = " Remove Space from both side ";
        System.out.println(strip.strip());

    }
}