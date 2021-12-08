package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractMapping

class TestMapping extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        if (obj instanceof String) {
            return obj.toUpperCase()
        }
        return obj
    }

}
