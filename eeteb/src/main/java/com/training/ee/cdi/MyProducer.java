package com.training.ee.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class MyProducer {

    @Produces
    @Named("osm")
    @RequestScoped
    public MyBeanOther createOtherBean() {
        MyBeanOther myBeanOtherLoc = new MyBeanOther();
        myBeanOtherLoc.setName("osman");
        return myBeanOtherLoc;
    }

    @Named("al")
    @Produces
    @SessionScoped
    public MyBeanOther createOtherBean2() {
        MyBeanOther myBeanOtherLoc = new MyBeanOther();
        myBeanOtherLoc.setName("ali");
        return myBeanOtherLoc;
    }

    @Named("vel")
    @Produces
    @ApplicationScoped
    public MyBeanOther createOtherBean3() {
        MyBeanOther myBeanOtherLoc = new MyBeanOther();
        myBeanOtherLoc.setName("veli");
        return myBeanOtherLoc;
    }

}
