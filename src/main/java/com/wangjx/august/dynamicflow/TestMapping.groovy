package com.wangjx.august.dynamicflow

class TestMapping extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        if (obj instanceof String) {
            return obj.toUpperCase()
        }
        return obj
    }

}
