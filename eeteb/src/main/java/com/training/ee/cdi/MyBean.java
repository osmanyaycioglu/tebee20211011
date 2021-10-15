package com.training.ee.cdi;


public class MyBean {

    private String name;


    public MyBean() {
    }

    public String hello() {
        return "Hello " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

}
