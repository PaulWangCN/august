package com.wangjx.august.dynamicflow

class DynamicFlowInterpreter {


    void interpreter() {
        String prefix = new File("scripts/prefix.groovy").text
        String content = new File("scripts/testscript.wjx").text
        def script =
                """
${prefix}
${content}
"""
        // 执行拼接好的脚本
        new GroovyShell().evaluate(script)
    }

}

