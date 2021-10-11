package com.teb.training.java;


public class MakePersonWalk implements IWalk {

    @Override
    public void walk(final Person person,
                     final int saniye) {
        double length = person.getHeight() * saniye;
        System.out.println(person.getName() + " " + person.getSurname() + " " + length + " kadar ilerledi.");
    }
}
