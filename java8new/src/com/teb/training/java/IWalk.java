package com.teb.training.java;


public interface IWalk {

    static final String name = "osman";

    void walk(final Person person,
              final int saniye);

    default void doWalk(final Person person,
                        final int saniye) {
        System.out.println("Starting to walk");
        this.walk(person,
                  saniye);
        System.out.println("walk ended");
    }

    public static void myInterfaceStaticMethod() {
        System.out.println("static method");
    }

}
