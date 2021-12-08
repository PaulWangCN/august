package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractMapping

class ToListMapping extends AbstractMapping {

    @Override
    Object trans(Object... obj) {
        List<Object> list = new ArrayList<>()
        list.add(obj[0])
        list.add("add from ToListMapping")
        return list
    }

}
