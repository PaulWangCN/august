package com.wangjx.august.core;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.io.File;

/**
 * @ClassName: Executor
 * @Description: TODO
 * @Author: wangjiaxing
 * @Date: 2021/12/03 15:31
 * @Version 1.0
 */
public class Executor {

    public void exec(String scriptFileName, String methodName, Object params) {
        try {
            File scriptFile = new File(scriptFileName);
            GroovyClassLoader loader = new GroovyClassLoader();
            Class fileCreator = loader.parseClass(scriptFile);
            GroovyObject object = (GroovyObject) fileCreator.newInstance();
            Object o = object.invokeMethod(methodName, params);
            if (o != null) {
                System.out.println("脚本执行结果:" + o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.exec("src/main/java/com/wangjx/august/dynamicflow/DynamicFlowInterpreter.groovy", "interpreter", null);
    }

}
