package com.wangjx.august.dynamicflow.base

abstract class AbstractOutput implements BaseOutput {

    public Map context;

    def context(Map context) {
        this.context = context
    }

}
