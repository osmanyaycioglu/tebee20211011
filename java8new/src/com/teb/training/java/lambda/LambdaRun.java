package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class LambdaRun {

    public static void main(final String[] args) {
        String name = "ali";
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);
        personLoc.setWeight(95);
        System.out.println("------------Normal class-------------");
        IGreet greetLoc = new GreetENG();
        LambdaRun.runGreeting(greetLoc,
                              personLoc);
        System.out.println("------------Anonim class-------------");
        IGreet greetLoc2 = new IGreet() {

            @Override
            public String greet(final Person a) {
                System.out.println(name);
                return "Hello " + a.getName() + " " + a.getSurname();
            }
        };
        LambdaRun.runGreeting(greetLoc2,
                              personLoc);

        IGreet greetLoc2a = new IGreet() {

            @Override
            public String greet(final Person a) {
                System.out.println(name);
                return "Merhaba " + a.getName() + " " + a.getSurname();
            }
        };


        System.out.println("------------Lambda class-------------");
        LambdaRun.runGreeting(a -> "Hello " + a.getName() + " " + a.getSurname(),
                              new Person().setName("nil")
                                          .setSurname("yaycıoğlu")
                                          .setHeight(178)
                                          .setWeight(61));

        System.out.println("------------Lambda modern class-------------");

        GreetingProcessor.processor()
                         .greet(a -> "Hello " + a.getName() + " " + a.getSurname())
                         .person(() -> new Person().setName("nil")
                                                   .setSurname("yaycıoğlu")
                                                   .setHeight(178)
                                                   .setWeight(61))
                         .run();

        System.out.println("------------end-------------");

        IGreet greetLoc3 = a -> "Hello " + a.getName() + " " + a.getSurname();
        IGreet greetLoc4 = b -> {
            System.out.println(name);
            return "Hello " + b.getName() + " " + b.getSurname();
        };
        IGreet greetLoc5 = a -> "Merhaba " + a.getName() + " " + a.getSurname();
    }

    public static void runGreeting(final IGreet greetParam,
                                   final Person personParam) {
        System.out.println(greetParam.greet(personParam));
    }
}
