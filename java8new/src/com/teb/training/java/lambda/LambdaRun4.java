package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class LambdaRun4 {

    public static void main(final String[] args) {
        IHello helloLoc = LambdaRun4::abc;
        System.out.println(helloLoc.hello("osman",
                                          "yaycıoğlu"));
        LambdaRun4 lambdaRun4Loc = new LambdaRun4();
        IHello helloLoc2 = lambdaRun4Loc::opt;
        System.out.println(helloLoc2.hello("ali",
                                           "veli"));

        IHello hello = (y,
                        m) -> {
            System.out.println("Deneme");
            return "Hello " + y + " " + m;
        };

        IHello hello2 = (y,
                         m) -> "Hello " + y + " " + m;

        GreetingProcessor.processor()
                         .greet(LambdaRun4::greetStatic)
                         .person(() -> new Person().setName("nil")
                                                   .setSurname("yaycıoğlu")
                                                   .setHeight(178)
                                                   .setWeight(61))
                         .run();

        GreetingProcessor.processor()
                         .greet(p -> {
                             String name = p.getName();
                             if (name == null) {
                                 name = "unknown";
                             }
                             // test(); yanlış
                             return "Greet from lambda " + name + " " + p.getSurname();
                         })
                         .person(() -> new Person().setName("nil")
                                                   .setSurname("yaycıoğlu")
                                                   .setHeight(178)
                                                   .setWeight(61))
                         .run();


    }

    public static String greetStatic(final Person personParam) {
        String name = personParam.getName();
        if (name == null) {
            name = "unknown";
        }
        return "Greet from static method " + name + " " + personParam.getSurname();
    }

    public String opt(final String str1,
                      final String str2) {
        return "Hello from object method " + str1 + " " + str2;
    }


    public static String abc(final String str1,
                             final String str2) {
        return "Hello from static method " + str1 + " " + str2;
    }

    public static String abc2(final String str1) {
        return "Hello from static method " + str1;
    }

}
