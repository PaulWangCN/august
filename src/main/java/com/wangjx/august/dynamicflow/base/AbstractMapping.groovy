package com.wangjx.august.dynamicflow.base

abstract class AbstractMapping implements BaseMapping {

    Map context;

    def context(Map context) {
        this.context = context
    }

}
