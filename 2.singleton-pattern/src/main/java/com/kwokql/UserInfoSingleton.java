package com.kwokql;

/**
 * @author ql kwok
 * 懒汉单例
 */
public class UserInfoSingleton {

    private static UserInfoSingleton instance = null;

    private UserInfoSingleton() {
        //private 方式在外面使用 new 来创建对象
    }

    public static UserInfoSingleton getInstance() {
        if (instance == null) {
            instance = new UserInfoSingleton();
        }
        return instance;
    }



    public static void main(String[] args) {

        UserInfoSingleton instanceA = UserInfoSingleton.getInstance();

        UserInfoSingleton instanceB = UserInfoSingleton.getInstance();

        System.out.println(instanceA == instanceB);
    }
}
