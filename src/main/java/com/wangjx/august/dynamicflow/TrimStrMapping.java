package com.wangjx.august.dynamicflow;

import com.wangjx.august.dynamicflow.base.AbstractMapping;

/**
 * @ClassName: ReplaceStrMapping
 * @Description:
 * @Author: wangjiaxing
 * @Date: 2021/12/08 18:28
 * @Version 1.0
 */
public class TrimStrMapping extends AbstractMapping {
    @Override
    public Object trans(Object... obj) {
        Object ori = obj[0];
        Object target = obj[1];
        if (ori instanceof String) {
            String oriStr = (String)ori;
            return ((String)context.get("result")).replace(oriStr, (String)target);
        }
        return obj;
    }
}
