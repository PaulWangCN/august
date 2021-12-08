package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractMapping

class TestMapping extends AbstractMapping {

    @Override
    Object trans(Object... obj) {
        if (obj[0] instanceof String) {
            return obj[0].toUpperCase()
        }
        return obj[0]
    }

}
