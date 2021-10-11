package com.teb.training.java;


public interface IRun {

    void run(final Person person,
             final int saniye);

    default void doRun(final Person person,
                       final int saniye) {
        System.out.println("Starting to run");
        this.run(person,
                 saniye);
        System.out.println("run ended");
    }
}
