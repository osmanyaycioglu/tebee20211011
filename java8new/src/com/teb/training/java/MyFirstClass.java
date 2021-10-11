package com.teb.training.java;


public class MyFirstClass {

    public static void main(final String[] args) {

        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);
        personLoc.setWeight(95);

        IWalk walkLoc = new MakePersonWalk();

        walkLoc.walk(personLoc,
                     10);

        System.out.println("Hello world");

        PersonMover moverLoc = new PersonMover();
        moverLoc.doWalk(personLoc,
                        10);
        moverLoc.doRun(personLoc,
                       10);

        IWalk.myInterfaceStaticMethod();

        PersonMover personMoverLoc = new PersonMover();

        PersonMover.myClassStaticMethod();
    }

}
