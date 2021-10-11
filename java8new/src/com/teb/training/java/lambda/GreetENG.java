package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class GreetENG implements IGreet {

    @Override
    public String greet(final Person personParam) {
        return "Hello " + personParam.getName() + " " + personParam.getSurname();
    }
}
