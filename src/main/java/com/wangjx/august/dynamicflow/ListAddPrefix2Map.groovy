package com.wangjx.august.dynamicflow

import com.wangjx.august.dynamicflow.base.AbstractMapping


class ListAddPrefix2Map extends AbstractMapping {

    @Override
    Object trans(Object... obj) {
        List<Map> result = new ArrayList<>()
        if (obj[0] instanceof String) {
            String prefix = (String)obj[0]
            for (String o : context.get("result")) {
                Map<String, Object> map = [:]
                map.put(prefix, o)
                result.add(map)
            }
        }
        return result
    }

}
