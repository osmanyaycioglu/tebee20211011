package com.teb.training.java.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.teb.training.java.Person;

public class StreamRun3 {

    public static void main(final String[] args) throws Exception {
        Path pathLoc = Paths.get("person.txt");
        List<Person> collectLoc = Files.readAllLines(pathLoc,
                                                     Charset.forName("UTF-8"))
                                       .stream()
                                       .map(s -> s.split(";"))
                                       .filter(sa -> sa.length == 4)
                                       .map(sa -> new Person().setName(sa[0])
                                                              .setSurname(sa[1])
                                                              .setHeight(sa[2] == null ? 0 : Integer.parseInt(sa[2]))
                                                              .setWeight(Integer.parseInt(sa[3])))
                                       .filter(p -> p.getWeight() > 60)
                                       .collect(Collectors.toList());

        collectLoc.forEach(p -> System.out.println(p));
    }

}
