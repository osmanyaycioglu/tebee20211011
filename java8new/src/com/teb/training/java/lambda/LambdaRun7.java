package com.teb.training.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaRun7 {

    public static void main(final String[] args) {
        // 1
        Function<String, Integer> functionLoc = s -> Integer.parseInt(s);
        Integer applyLoc = functionLoc.apply("1330");
        System.out.println("sonuç : " + applyLoc);

        BiFunction<Integer, Integer, Integer> biFunctionLoc = (val1,
                                                               val2) -> val1 + val2;
        Integer apply2Loc = biFunctionLoc.apply(10,
                                                20);
        System.out.println("sonuç : " + apply2Loc);

        Function<String, String> fnc = s -> "Hello " + s;

        UnaryOperator<String> un = s -> "Hello " + s;

        // 2
        Consumer<String> strConsumerLoc = s -> System.out.println(s);
        strConsumerLoc.accept("osman");

        BiConsumer<String, String> concatStrBiConsumerLoc = (s1,
                                                             s2) -> System.out.println(s1 + " " + s2);

        concatStrBiConsumerLoc.accept("hello",
                                      "osman");

        // 3
        Supplier<String> supplierLoc = () -> "osman";

        System.out.println(supplierLoc.get());

        // 4
        Predicate<String> sPredicateLoc = s -> s.length() > 5;
        if (sPredicateLoc.test("osmany")) {
            System.out.println("5 den büyük");
        }

        BiPredicate<Integer, Integer> sBiPredicateLoc = (i1,
                                                         i2) -> i1 > i2;
        if (sBiPredicateLoc.test(20,
                                 10)) {
            System.out.println("Büyük");
        }
        //        List listLoc = new ArrayList();
        //        listLoc.add("osman");
        //        listLoc.add(10);
        //        listLoc.add(100L);
        //
        //
        //        Object objectLoc = listLoc.get(0);
        //        if (objectLoc instanceof String) {
        //
        //        } else if (objectLoc instanceof Integer) {
        //
        //        } else if (objectLoc instanceof Long) {
        //
        //        }
        //
        //        List<String> stringsLoc = new ArrayList<>();
        //        stringsLoc.add("osman");
        //        String stringLoc = stringsLoc.get(0);

    }


}
