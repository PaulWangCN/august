package com.wangjx.august.dynamicflow

class TestOutput extends AbstractOutput {

    @Override
    void out(Object obj) {
        println "TestOutput.out: " + obj
    }
}
