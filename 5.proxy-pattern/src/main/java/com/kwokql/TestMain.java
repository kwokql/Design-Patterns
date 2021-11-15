package com.kwokql;

import com.kwokql.dynamic.DynamicHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {


    /**
     * 测试
     */
    public static void main(String[] args) {

//        //静态代理
//        Subject proxy = new MyProxy();
//        proxy.run();
//        System.out.println("result:"+proxy.getResult());

        // 被代理的对象
        RealSubject realSubject = new RealSubject();
        // 被代理对象的类加载器
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        // 被代理对象的所有接口
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        // 创建被代理对象的处理逻辑对象
        InvocationHandler handler = new DynamicHandler(realSubject);
        /*
		  jdk 会根据我们传入的参数 动态的在 jvm中生成代理对象的字节码加载 转为 内存中的Object的对象
		  根据Object.newInstance 生成我们想要的代理对象
		 */
        Subject proxy1 = (Subject) Proxy.newProxyInstance(classLoader, interfaces, handler);
        proxy1.run();
        System.out.println("result:"+proxy1.getResult());
    }


}
