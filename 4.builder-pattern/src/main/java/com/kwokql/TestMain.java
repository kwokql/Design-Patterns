package com.kwokql;

/**
 * @author ql kwok
 */

public class TestMain {

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        Product product = director.builder();
        System.out.println(product);
    }

}
