package com.kwokql;

/**
 * @author ql kwok
 * @date 2021年11月11日 22:39
 */

public class TestMain {


    /**
     * 工厂产品
     */
    public interface Product {
        /**
         * 产品显示
         */
        void show();
    }

    /**
     * 产品电脑A
     */
    static class ComputerA implements Product {

        @Override
        public void show() {
            System.out.println("产品电脑A");
        }
    }

    /**
     * 产品电脑B
     */
    static class ComputerB implements Product {
        @Override
        public void show() {
            System.out.println("产品电脑B");
        }
    }

    /**
     * 配件产品A
     */
    static class PartsA implements Product {

        @Override
        public void show() {
            System.out.println("配件产品A");
        }
    }

    /**
     * 配件产品B
     */
    static class PartsB implements Product {
        @Override
        public void show() {
            System.out.println("配件产品B");
        }
    }

    /**
     * 电脑工厂
     */
    interface Factory{
        /**
         * 产品生产
         * @param type 产品类型
         * @return com.kwokql.TestMain.Product
         */
        Product production(String type);
    }

    /**
     * 电脑工厂
     */
    static class ComputerFactory implements Factory{
        @Override
        public Product production(String type) {
            switch (type) {
                case "A":
                    return new ComputerA();
                case "B":
                    return new ComputerB();
                case "C":
                    return new PartsA();
                case "D":
                    return new PartsB();
                default:
                    return null;
            }
        }
    }

    /**
     * 配件工厂
     */
    static class PartsFactory implements Factory{
        @Override
        public Product production(String type) {
            switch (type) {
                case "A":
                    return new PartsA();
                case "B":
                    return new PartsB();
                default:
                    return null;
            }
        }
    }


    public static void main(String[] args) {
        // 电脑工厂
        Factory computerFactory = new ComputerFactory();
        Product computerA = computerFactory.production("A");
        computerA.show();
        Product computerB = computerFactory.production("B");
        computerB.show();


        //配件工厂
        Factory partsFactory = new PartsFactory();
        computerA = partsFactory.production("A");
        computerA.show();
        computerB = partsFactory.production("B");
        computerB.show();

    }

}
