package com.kwokql;


/**
 * 代理
 * @author kwokql
 */
public class MyProxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void run() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRun();
        realSubject.run();
        postRun();
    }

    @Override
    public String getResult() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRun();
        String result = realSubject.getResult();
        postRun();
        return result;
    }

    public void preRun() {
        System.out.println("前置处理");
    }
    public void postRun() {
        System.out.println("后置处理");
    }
}
