package com.teb.training.java.lambda;

import com.teb.training.java.Person;

@FunctionalInterface
public interface IGreet {

    String greet(Person personParam);


    default void test() {
        this.greet(new Person());
        System.out.println("test");
    }
}
