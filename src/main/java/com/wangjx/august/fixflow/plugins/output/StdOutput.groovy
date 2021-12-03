package com.wangjx.august.fixflow.plugins.output

class StdOutput implements BaseOutput {
    @Override
    void to(Object from) {
        println 'StdOutput output: ' + from
    }
}
