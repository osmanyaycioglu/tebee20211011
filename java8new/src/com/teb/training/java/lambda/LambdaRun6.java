package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class LambdaRun6 {

    public static void main(final String[] args) {
        LambdaRun5.greetPerson(a -> "Hello " + a.getName() + " " + a.getSurname(),
                               new Person().setName("nil")
                                           .setSurname("yaycıoğlu")
                                           .setHeight(178)
                                           .setWeight(61));

    }


}
