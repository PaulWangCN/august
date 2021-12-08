package com.wangjx.august.dynamicflow.base

abstract class AbstractInput implements BaseInput {

    public Map context;

    def context(Map context) {
        this.context = context
    }

}
