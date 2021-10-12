package com.teb.training.java.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.teb.training.java.atm.models.Customer;

public class StreamRun2 {

    public static void main(final String[] args) {
        List<String> stringsLoc = Arrays.asList("osman yaycıoğlu",
                                                "osman yaycıoğlu",
                                                "osman yaycıoğlu",
                                                "ali yaycıoğlu",
                                                "veli yaycıoğlu",
                                                "mehmet alaz",
                                                "ayşe kula",
                                                "fatma alaz",
                                                "nil yaycıoğlu",
                                                "osman orta",
                                                "osman son",
                                                "mehmet deneme",
                                                "mehmet test");
        String collect3Loc = stringsLoc.stream()
                                       .skip(5)
                                       .distinct()
                                       .sorted()
                                       .peek(s -> System.out.println("peek : " + s))
                                       .collect(Collectors.joining(";"));

        System.out.println(collect3Loc);

        String reduceLoc = stringsLoc.stream()
                                     .skip(5)
                                     .distinct()
                                     .sorted()
                                     .peek(s -> System.out.println("peek : " + s))
                                     .reduce("start",
                                             (before,
                                              current) -> {
                                                 if (before.equals("start")) {
                                                     return current;
                                                 } else {
                                                     return before + ";" + current;
                                                 }
                                             },
                                             (s1,
                                              s2) -> s1 + ";" + s2);

        System.out.println("Reduce : " + reduceLoc);

        Integer reduce2Loc = stringsLoc.stream()
                                       .skip(5)
                                       .distinct()
                                       .sorted()
                                       .peek(s -> System.out.println("peek : " + s))
                                       .reduce(0,
                                               (before,
                                                current) -> before + current.length(),
                                               (s1,
                                                s2) -> s1 + s2);

        System.out.println("Reduce Integer : " + reduce2Loc);


        IntSummaryStatistics summaryStatisticsLoc = stringsLoc.stream()
                                                              .skip(5)
                                                              .distinct()
                                                              .sorted()
                                                              .peek(s -> System.out.println("peek : " + s))
                                                              .mapToInt(s -> s.length())
                                                              .summaryStatistics();

        System.out.println("INt sonuç : " + summaryStatisticsLoc);
        System.out.println("----------------------------");
        List<String> collectLoc = stringsLoc.stream()
                                            .skip(5)
                                            .distinct()
                                            .sorted()
                                            .limit(2)
                                            .filter(s -> s.length() > 3)
                                            .collect(Collectors.toList());

        Map<String, Customer> collect2Loc = stringsLoc.stream()
                                                      .distinct()
                                                      .sorted()
                                                      .map(s -> s.split(" "))
                                                      .map(sa -> new Customer().setName(sa[0])
                                                                               .setSurname(sa[1]))
                                                      .collect(Collectors.toMap(c -> c.getName() + "_" + c.getSurname(),
                                                                                c -> c));


        collect2Loc.entrySet()
                   .forEach(e -> System.out.println("Key : " + e.getKey() + " Value : " + e.getValue()));
    }
}
