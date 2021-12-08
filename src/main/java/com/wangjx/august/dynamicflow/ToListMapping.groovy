package com.wangjx.august.dynamicflow

class ToListMapping extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        List<Object> list = new ArrayList<>()
        list.add(obj)
        list.add("add from ToListMapping")
        return list
    }

}
