package com.kwokql;

/**
 * 抽象主题
 * @author kwokql
 */
public interface Subject {

    /**
     * 业务逻辑方法
     */
    void run();

    /**
     * 业务逻辑方法
     */
    String getResult();
}
