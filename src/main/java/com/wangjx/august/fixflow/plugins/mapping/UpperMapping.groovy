package com.wangjx.august.fixflow.plugins.mapping

class UpperMapping implements BaseMapping {
    @Override
    Object trans(Object from) {
        return ((String)from).toUpperCase()
    }
}
