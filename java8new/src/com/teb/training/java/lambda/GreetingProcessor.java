package com.teb.training.java.lambda;


public class GreetingProcessor {

    private IPersonSupplier personSupplier;
    private IGreet          greet;


    private GreetingProcessor() {
    }

    public static GreetingProcessor processor() {
        return new GreetingProcessor();
    }


    public GreetingProcessor person(final IPersonSupplier personSupplierParam) {
        this.personSupplier = personSupplierParam;
        return this;
    }

    public GreetingProcessor greet(final IGreet greetParam) {
        this.greet = greetParam;
        return this;
    }

    public void run() {
        System.out.println(this.greet.greet(this.personSupplier.getPerson()));
    }
}
