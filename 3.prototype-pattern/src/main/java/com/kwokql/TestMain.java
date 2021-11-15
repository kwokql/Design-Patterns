package com.kwokql;

/**
 * @author ql kwok
 */

public class TestMain {


    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("张三");
        UserInfo clone = (UserInfo) userInfo.clone();

        System.out.println("比对结果:" + (clone == userInfo));
        System.out.println("原型:" + userInfo);
        System.out.println("拷贝:" + clone);

        System.out.println("修改拷贝里面的复杂属性");
        clone.getJob().setName("张三的工作B");


        System.out.println("比对结果:" + (clone == userInfo));
        System.out.println("原型:" + userInfo);
        System.out.println("拷贝:" + clone);

    }

}
