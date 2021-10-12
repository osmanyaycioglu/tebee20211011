package com.teb.training.java.stream;

import java.util.Arrays;
import java.util.List;

public class StreamRun4 {

    public static void main(final String[] args) {
        List<String> stringsLoc = Arrays.asList("osman",
                                                "ali",
                                                "veli",
                                                "mehmet",
                                                "ayşe",
                                                "fatma",
                                                "nil",
                                                "osman",
                                                "osman",
                                                "mehmet",
                                                "mehmet");
        boolean allMatchLoc = stringsLoc.stream()
                                        .allMatch(s -> s.length() > 2);
        System.out.println("All match result : " + allMatchLoc);
        boolean anyMatchLoc = stringsLoc.stream()
                                        .anyMatch(s -> s.length() > 5);
        System.out.println("Any match result : " + anyMatchLoc);

        stringsLoc.stream()
                  .filter(s -> s.length() > 10)
                  .findAny()
                  .ifPresent(s -> System.out.println(s));

        stringsLoc.stream()
                  .distinct()
                  .dropWhile(s -> s.length() > 4)
                  .forEach(s -> System.out.println(s));


    }
}
