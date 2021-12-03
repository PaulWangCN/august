package com.wangjx.august.fixflow.plugins.input

class StdInput implements BaseInput {

    def from

//    StdInput(String from) {
//        this.from = from
//    }

    @Override
    Object from(String from) {
        return this.from = from
    }

}
