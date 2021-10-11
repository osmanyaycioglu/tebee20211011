package com.teb.training.java;


public class MakePersonWalkNew implements IWalk {

    @Override
    public void walk(final Person person,
                     final int saniye) {
        double length = (person.getHeight() * saniye) / 2;
        System.out.println(person.getName() + " " + person.getSurname() + " " + length + "cm kadar ilerledi.");
    }
}
