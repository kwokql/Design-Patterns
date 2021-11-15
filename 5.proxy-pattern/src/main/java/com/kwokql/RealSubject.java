package com.kwokql;

/**
 * @author ql kwok
 * 真实主题
 */

public class RealSubject implements Subject {

    @Override
    public void run() {
        System.out.println("原逻辑");
    }

    @Override
    public String getResult() {
        System.out.println("原有逻辑");
        return "原有逻辑";
    }
}
