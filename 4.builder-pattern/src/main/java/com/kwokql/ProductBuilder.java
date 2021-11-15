package com.kwokql;

/**
 * 抽象建造者
 * 不一定需要使用抽象类，
 * 使用接口也是可以的
 * 但是必须要提供一个 返回产品的方法才能够算得上抽象建造者
 */
public abstract class ProductBuilder {

    /**
     * 创建产品对象
     */
    protected Product product = new Product();

    public abstract void buildVar1(String var1);

    public abstract void buildVar2(String var2);

    public abstract void buildVar3(String var3);

    public Product builder() {
        return product;
    }

}
