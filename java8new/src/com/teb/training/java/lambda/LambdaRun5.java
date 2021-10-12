package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class LambdaRun5 {

    public static void main(final String[] args) {

        IGreet greetClass = new GreetENG();
        System.out.println(greetClass.greet(new Person().setName("nil")
                                                        .setSurname("yaycıoğlu")
                                                        .setHeight(178)
                                                        .setWeight(61)));

        IGreet greetLoc = a -> "Hello " + a.getName() + " " + a.getSurname();
        System.out.println(greetLoc.greet(new Person().setName("nil")
                                                      .setSurname("yaycıoğlu")
                                                      .setHeight(178)
                                                      .setWeight(61)));

        greetPerson(a -> "Hello " + a.getName() + " " + a.getSurname(),
                    new Person().setName("nil")
                                .setSurname("yaycıoğlu")
                                .setHeight(178)
                                .setWeight(61));

        greetPerson(a -> "Merhaba " + a.getName() + " " + a.getSurname(),
                    new Person().setName("nil")
                                .setSurname("yaycıoğlu")
                                .setHeight(178)
                                .setWeight(61));

        greetPerson(a -> "Ola " + a.getName() + " " + a.getSurname(),
                    new Person().setName("nil")
                                .setSurname("yaycıoğlu")
                                .setHeight(178)
                                .setWeight(61));

    }

    public static void greetPerson(final IGreet greet,
                                   final Person person) {
        System.out.println(greet.greet(person));
    }

    public static void greetPerson(final int type,
                                   final Person person) {
        switch (type) {
            case 1:
                System.out.println("Hello " + person.getName() + " " + person.getSurname());
                break;
            case 2:
                System.out.println("Merhaba " + person.getName() + " " + person.getSurname());
                break;
            case 3:
                System.out.println("Ola " + person.getName() + " " + person.getSurname());
                break;

            default:
                break;
        }
    }


}
