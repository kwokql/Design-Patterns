package com.kwokql;

public class TestMain {


    /**
     * 抽象主题
     */
    interface Subject {
        void run();
    }

    /**
     * 真实主题
     */
    static class RealSubject implements Subject {
        public void run() {
            System.out.println("原逻辑");
        }
    }

    /**
     * 代理
     */
    static class Proxy implements Subject {
        private RealSubject realSubject;

        public void run() {
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            preRun();
            realSubject.run();
            postRun();
        }

        public void preRun() {
            System.out.println("前置处理");
        }
        public void postRun() {
            System.out.println("后置处理");
        }
    }



    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.run();

    }
}
