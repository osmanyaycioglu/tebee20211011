package com.training.ee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyFirstStatelessEJB {

    private int total; // stateless da tutulmaz

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
