package com.teb.training.java.lambda;

import java.util.function.Consumer;

public class SysoutConsumer implements Consumer<String> {

    @Override
    public void accept(final String tParam) {
        System.out.println(tParam);
    }

}
