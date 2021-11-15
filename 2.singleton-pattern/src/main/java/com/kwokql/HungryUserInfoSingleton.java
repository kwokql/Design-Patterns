package com.kwokql;

/**
 * @author ql kwok
 * 饿汉单例
 */
public class HungryUserInfoSingleton {

    private static final HungryUserInfoSingleton instance = new HungryUserInfoSingleton();

    private HungryUserInfoSingleton() {
        //private 方式在外面使用 new 来创建对象
    }

    public static HungryUserInfoSingleton getInstance() {
        return instance;
    }



    public static void main(String[] args) {

        HungryUserInfoSingleton instanceA = HungryUserInfoSingleton.getInstance();

        HungryUserInfoSingleton instanceB = HungryUserInfoSingleton.getInstance();

        System.out.println(instanceA == instanceB);
    }
}
