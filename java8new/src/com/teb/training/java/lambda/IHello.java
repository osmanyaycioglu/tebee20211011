package com.teb.training.java.lambda;


public interface IHello {

    String hello(String name,
                 String surname);

    default void xyz() {
        System.out.println("Hello me");
    }

}
