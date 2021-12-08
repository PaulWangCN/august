package com.wangjx.august.dynamicflow


class ListAddPrefix2Map extends AbstractMapping {

    @Override
    Object trans(Object obj) {
        List<Map> result = new ArrayList<>()
        if (obj instanceof String) {
            String prefix = (String)obj
            for (String o : context.get("result")) {
                Map<String, Object> map = [:]
                map.put(prefix, o)
                result.add(map)
            }
        }
        return result
    }

}
