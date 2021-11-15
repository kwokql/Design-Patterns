package com.kwokql;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author ql kwok
 * @date 2021年11月12日 10:32
 * 线程安全懒汉单例
 */
public class SafetyUserInfoSingleton {

    /**
     * 使用 volatile 保证 其他线程的 引用能被及时更新
     */
    private static volatile SafetyUserInfoSingleton instance = null;

    private SafetyUserInfoSingleton() {
        //private 方式在外面使用 new 来创建对象
    }

    /**
     *  使用 synchronized 关键字保证 只有一个线程可以 可以进行初始化操作
     *  防止 多个线程同时进入 造成多次单例创建
     */
    public static synchronized SafetyUserInfoSingleton getInstance() {
        if (instance == null) {
            instance = new SafetyUserInfoSingleton();
        }
        return instance;
    }



    public static void main(String[] args) {

        SafetyUserInfoSingleton[] arrays = new SafetyUserInfoSingleton[1000];

        IntStream.range(0,1000).forEach(e -> {
            SafetyUserInfoSingleton instance = SafetyUserInfoSingleton.getInstance();
            arrays[e] = instance;
        });

        for (SafetyUserInfoSingleton singleton : arrays) {
            System.out.println(singleton);
        }

    }
}
