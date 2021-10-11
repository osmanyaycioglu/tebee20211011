package com.teb.training.java.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaRun3 {

    public static void main(final String[] args) {
        List<String> sListLoc = Arrays.asList("osman",
                                              "nil",
                                              "mehmet",
                                              "ali",
                                              "veli");

        System.out.println("------------Lambda-------------");
        sListLoc.forEach(g -> System.out.println(g));
        System.out.println("------------Class-------------");
        sListLoc.forEach(new SysoutConsumer());
        System.out.println("------------Old-------------");
        for (String stringLoc : sListLoc) {
            System.out.println(stringLoc);
        }
        System.out.println("------------Method mapping-------------");
        sListLoc.forEach(LambdaRun3::alternative);

    }

    public static void alternative(final String str) {
        if (str.length() > 3) {
            System.out.println(str);
        }
    }
}
