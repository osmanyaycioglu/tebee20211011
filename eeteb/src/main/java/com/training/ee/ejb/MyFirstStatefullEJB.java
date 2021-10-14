package com.training.ee.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class MyFirstStatefullEJB {

    private int                 total;       // bu doğru dur.

    @EJB
    private MyFirstSingletonEJB singletonEJB;

    public MyFirstStatefullEJB() {
        this.singletonEJB.add(0,
                              1);
    }

    @PostConstruct
    public void init() {
        System.out.println("after construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("before destroy");
    }

    @PrePassivate
    public void beforeSerialize() {
        System.out.println("before Serialize");
    }

    @PostActivate
    public void afterObject() {
        System.out.println("after desrialize");
    }

    @Remove
    public void delete() {
        System.out.println("ejb removed");
    }

    public int add(final int v1,
                   final int v2) {
        int iLoc = v1 + v2;
        this.total += iLoc;
        return iLoc;
    }


    public int subs(final int v1,
                    final int v2) {
        int iLoc = v1 - v2;
        this.total += iLoc;
        return iLoc;
    }

    public int getTotal() {
        return this.total;
    }

}
