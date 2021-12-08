package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractOutput

class TestOutput extends AbstractOutput {

    @Override
    void out(Object obj) {
        println "TestOutput.out: " + obj
    }
}
