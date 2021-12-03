package com.wangjx.august.fixflow

class FixFlowInterpreter {

    void interpreter() {
        String config = new File("scripts/upper-str.wjx").text
        println config
        def script =
"""
import com.wangjx.august.fixflow.plugins.input.StdInput
import com.wangjx.august.fixflow.plugins.mapping.UpperMapping
import com.wangjx.august.fixflow.plugins.output.StdOutput
import com.wangjx.august.fixflow.FixFlowContext

FixFlowContext.flow {
    input StdInput
    mapping UpperMapping
    output StdOutput
    context 'uiui'
    flow
}
"""
        // 执行拼接好的脚本
        new GroovyShell().evaluate(script)
    }

}
