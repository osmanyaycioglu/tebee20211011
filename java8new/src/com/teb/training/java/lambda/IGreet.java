package com.teb.training.java.lambda;

import com.teb.training.java.Person;

@FunctionalInterface
public interface IGreet {

    String greet(Person personParam);

}
