package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractMapping

class AppendMapping extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        return context.get("result") + obj
    }
}
