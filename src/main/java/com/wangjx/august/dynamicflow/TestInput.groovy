package com.wangjx.august.dynamicflow

class TestInput extends AbstractInput {

    String p1;

    @Override
    Object accept(Object obj) {
        return obj + " " + p1
    }

    def p1(String p1) {
        this.p1 = p1
    }

}
