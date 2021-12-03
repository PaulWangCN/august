package com.wangjx.august.fixflow

import com.wangjx.august.fixflow.plugins.input.BaseInput
import com.wangjx.august.fixflow.plugins.mapping.BaseMapping
import com.wangjx.august.fixflow.plugins.output.BaseOutput

class FixFlowContext {

    BaseInput input
    BaseMapping mapping
    BaseOutput output
    String context

    def static flow(closure) {
        FixFlowContext fixFlow = new FixFlowContext()
        closure.delegate = fixFlow
        closure()
    }

    def <T extends BaseInput> void input(Class<T> t) {
        this.input = t.newInstance()
    }

    def <T extends BaseMapping> void mapping(Class<T> t) {
        this.mapping = t.newInstance()
    }

    def <T extends BaseOutput> void output(Class<T> t) {
        this.output = t.newInstance()
    }

    def context(Object obj) {
        this.context = obj
    }

    def static doInput(FixFlowContext fixFlow) {
        def result = fixFlow.input.from(fixFlow.context)
        fixFlow.context(result)
    }
    def static doMapping(FixFlowContext fixFlow) {
        def result = fixFlow.mapping.trans(fixFlow.context)
        fixFlow.context(result)
    }
    def static doOutput(FixFlowContext fixFlow) {
        def result = fixFlow.output.to(fixFlow.context)
        fixFlow.context(result)
    }

    def getFlow() {
        doInput(this)
        doMapping(this)
        doOutput(this)
    }

}
