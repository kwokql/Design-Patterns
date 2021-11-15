package com.kwokql;

public class Director {

    private final ProductBuilder builder;

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product builder() {
        builder.buildVar1("property1");
        builder.buildVar2("property2");
        builder.buildVar3("property3");
        return builder.builder();
    }
}
