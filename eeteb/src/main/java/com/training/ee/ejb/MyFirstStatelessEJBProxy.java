package com.training.ee.ejb;


public class MyFirstStatelessEJBProxy extends MyFirstStatelessEJB {


    private final MyFirstStatelessEJB ejb;

    public MyFirstStatelessEJBProxy(final MyFirstStatelessEJB ejbParam) {
        this.ejb = ejbParam;
    }

    @Override
    public int add(final int v1,
                   final int v2) {

        System.out.println("Add başlıyor");
        if (v1 < 0) {
            return 0;
        }
        return this.ejb.add(v1,
                            v2);
    }


    @Override
    public int subs(final int v1,
                    final int v2) {
        System.out.println("Add başlıyor");
        return this.ejb.subs(v1,
                             v2);
    }

    @Override
    public int getTotal() {
        return this.ejb.getTotal();
    }

}
