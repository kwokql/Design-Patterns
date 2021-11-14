package com.kwokql;

/**
 * 建造者模式 生产的产品
 * 通常是一个复杂的对象
 */
public class Product {

    /**
     * 属性1
     */
    private String var1;

    /**
     * 属性2
     */
    private String var2;

    /**
     * 属性3
     */
    private String var3;


    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        return var3;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                ", var3='" + var3 + '\'' +
                '}';
    }
}
