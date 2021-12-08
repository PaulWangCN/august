package com.wangjx.august.dynamicflow

class AppendMapping extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        return context.get("result") + obj
    }
}
