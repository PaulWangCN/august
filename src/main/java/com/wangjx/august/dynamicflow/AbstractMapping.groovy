package com.wangjx.august.dynamicflow

abstract class AbstractMapping implements BaseMapping {

    Map context;

    def context(Map context) {
        this.context = context
    }

}
