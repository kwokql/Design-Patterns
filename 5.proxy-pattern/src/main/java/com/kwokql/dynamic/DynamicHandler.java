package com.kwokql.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ql kwok
 * 处理器逻辑
 */
public class DynamicHandler implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private final Object target;

    public DynamicHandler(Object target) {
        this.target = target;
    }

    /**
     * 注意:代理的是对象的所有方法, 想要代理指定方法需要做判断
     * @author ql kwok
     * @param proxy 被代理的对象
     * @param method 调用的方法
     * @param args 方法参数
     * @return java.lang.Object 返回给用户的结果
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 自定义处理逻辑
        before();
        // 调用方法 获取返回值 没有返回值这里会是null
        Object result = method.invoke(target, args);
        // 自定义处理逻辑
        after();
        return result;
    }

    private void before() {
        System.out.println("before前置处理");
    }
    private void after() {
        System.out.println("after后置处理");
    }
}
