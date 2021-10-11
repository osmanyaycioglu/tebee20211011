package com.teb.training.java;

import java.io.Serializable;

public class PersonMover implements IWalk, IRun, Serializable, Comparable<PersonMover> {


    private static final long serialVersionUID = 8147730571479908964L;

    @Override
    public void run(final Person person,
                    final int saniye) {
        double length = person.getHeight() * saniye;
        System.out.println(person.getName() + " " + person.getSurname() + " " + length + "cm kadar koştu.");
    }

    @Override
    public void walk(final Person person,
                     final int saniye) {
        double length = (person.getHeight() * saniye) / 2;
        System.out.println(person.getName() + " " + person.getSurname() + " " + length + "cm kadar ilerledi.");

    }

    @Override
    public int compareTo(final PersonMover oParam) {
        return 0;
    }

    public static void myClassStaticMethod() {
        System.out.println("static method");
    }


}
