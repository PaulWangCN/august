package com.wangjx.august.dynamicflow

abstract class AbstractInput implements BaseInput {

    Map context;

    def context(Map context) {
        this.context = context
    }

}
