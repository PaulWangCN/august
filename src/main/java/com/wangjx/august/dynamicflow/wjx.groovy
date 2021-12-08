import com.wangjx.august.dynamicflow.base.BaseInput
import com.wangjx.august.dynamicflow.base.BaseMapping
import com.wangjx.august.dynamicflow.base.BaseOutput
import com.wangjx.august.core.ScanJar

allFile = [:]
def scanFile() {
    ScanJar handlerScanner = new ScanJar("com.wangjx.august", true, null, null)
    Set<Class<?>> classes = handlerScanner.doScanAllClasses()
    for (Class clazz : classes) {
        String name = clazz.getName()
        String[] seg = name.split("\\.")
        allFile.put(seg[seg.length - 1], name)
    }
}

scanFile()

context = [:]

def methodMissing(String name, args){
    args = args[0]
    def clazz = Class.forName(allFile.get(name))
    def instance = clazz.newInstance()
    if (args instanceof Closure) {
        def closure = (Closure)args
        closure.delegate = instance
        closure.invokeMethod("context", context)
        if (instance instanceof BaseMapping) {
            def result
            if (closure() == null) {
                result = closure.invokeMethod("trans", context.get("result"))
            } else {
                result = closure()
            }
            context.put("result", result)
        } else if (instance instanceof BaseOutput) {
            closure.invokeMethod("out", context.get("result"))
        } else if (instance instanceof BaseInput) {
            def result = closure()
            context.put("result", result)
        }
    }
}
def input(Closure closure) {
    closure.delegate = this
    closure()
}
def mapping(Closure closure) {
    closure.delegate = this
    closure()
}
def output(Closure closure) {
    closure.delegate = this
    closure()
}

input {
    TestInput {
        p1 "from wjx"
        accept "jack"
    }
}
mapping {
    TestMapping {}
    AppendMapping {
        trans "-wjx"
    }
    AppendMapping {
        trans "->2021-12-12"
    }
    ToListMapping {}
    ListAddPrefix2Map {
        trans "开始"
    }
}
output {
    TestOutput {}
}

