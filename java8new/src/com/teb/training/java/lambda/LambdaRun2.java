package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class LambdaRun2 {

    public static void main(final String[] args) {
        IGreet greetLoc = a -> "Hello " + a.getName() + " " + a.getSurname();
        IPersonSupplier pLoc = () -> new Person().setName("nil")
                                                 .setSurname("yaycıoğlu")
                                                 .setHeight(178)
                                                 .setWeight(61);
        IHello hello = (yow,
                        mil) -> "Hello " + yow + " " + mil;
    }
}
