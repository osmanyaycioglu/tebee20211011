package com.teb.training.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.teb.training.java.atm.models.Customer;

public class StreamRun1 {

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
        Set<String> uniqueSet = new TreeSet<>();
        for (String stringLoc : stringsLoc) {
            uniqueSet.add(stringLoc);
        }
        for (String stringLoc : uniqueSet) {
            if (stringLoc.length() > 3) {
                System.out.println(stringLoc);
            }
        }


        System.out.println("----------------------------");
        stringsLoc.stream()
                  .distinct()
                  .sorted()
                  .filter(s -> s.length() > 3)
                  .forEach(s -> System.out.println(s));
        System.out.println("----------------------------");
        stringsLoc.stream()
                  .distinct()
                  .sorted()
                  .filter(s -> s.length() > 3)
                  .forEach(System.out::println);
        System.out.println("----------------------------");
        stringsLoc.stream()
                  .distinct()
                  .sorted()
                  .filter(s -> (s.length() > 3) && !s.startsWith("a"))
                  .forEach(s -> System.out.println(s));

        System.out.println("----------------------------");
        stringsLoc.stream()
                  .filter(s -> (s.length() > 3) && !s.startsWith("a"))
                  .filter(s -> !s.startsWith("b"))
                  .distinct()
                  .sorted()
                  .map(s -> new Customer().setName(s)
                                          .setAmount(s.length()))
                  .filter(c -> c.getAmount() > 4)
                  .forEach(System.out::println);

        System.out.println("----------------------------");
        stringsLoc.stream()
                  .distinct()
                  .sorted()
                  .parallel()
                  .filter(s -> {
                      System.out.println("Filter 1 : "
                                         + s
                                         + " Thread : "
                                         + Thread.currentThread()
                                                 .getName());
                      return (s.length() > 3) && !s.startsWith("a");
                  })
                  .filter(s -> {
                      System.out.println("Filter 2 : "
                                         + s
                                         + " Thread : "
                                         + Thread.currentThread()
                                                 .getName());
                      return !s.startsWith("b");
                  })
                  .map(s -> {
                      System.out.println("Map : "
                                         + s
                                         + " Thread : "
                                         + Thread.currentThread()
                                                 .getName());
                      return new Customer().setName(s)
                                           .setAmount(s.length());
                  })
                  .filter(c -> {
                      System.out.println("Filter 3 : "
                                         + c
                                         + " Thread : "
                                         + Thread.currentThread()
                                                 .getName());
                      return c.getAmount() > 4;
                  })
                  .forEach(System.out::println);

    }
}
