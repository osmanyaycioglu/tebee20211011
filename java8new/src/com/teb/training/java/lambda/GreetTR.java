package com.teb.training.java.lambda;

import com.teb.training.java.Person;

public class GreetTR implements IGreet {

    @Override
    public String greet(final Person personParam) {
        return "Merhaba " + personParam.getName() + " " + personParam.getSurname();
    }
}
