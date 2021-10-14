package com.training.ee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class MyFirstSingletonEJB {

    private int total; // bu doğru dur.

    public MyFirstSingletonEJB() {
    }

    @Lock(LockType.WRITE)
    public int add(final int v1,
                   final int v2) {
        int iLoc = v1 + v2;
        this.total += iLoc;
        return iLoc;
    }

    @Lock(LockType.WRITE)
    public int subs(final int v1,
                    final int v2) {
        int iLoc = v1 - v2;
        this.total += iLoc;
        return iLoc;
    }

    @Lock(LockType.READ)
    public int getTotal() {
        return this.total;
    }

}
