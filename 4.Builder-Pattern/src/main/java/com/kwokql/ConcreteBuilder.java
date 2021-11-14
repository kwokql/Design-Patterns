package com.kwokql;

/**
 * 具体的建造者
 *
 */
public class ConcreteBuilder extends ProductBuilder {

    public void buildVar1(String var1) {
        this.product.setVar1(var1);
    }

    public void buildVar2(String var2) {
        this.product.setVar2(var2);
    }

    public void buildVar3(String var3) {
        this.product.setVar3(var3);
    }
}
