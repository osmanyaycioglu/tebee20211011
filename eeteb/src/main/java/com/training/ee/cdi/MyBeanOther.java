package com.training.ee.cdi;

import java.io.Serializable;

public class MyBeanOther implements Serializable {

    private String name;
    private long   counter;

    public MyBeanOther() {
        super();
    }

    public String hello() {
        this.counter++;
        return "Hello " + this.name + " counter : " + this.counter;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

}
