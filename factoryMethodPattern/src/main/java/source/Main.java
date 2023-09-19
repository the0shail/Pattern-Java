package source;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory1 = new ConcreteProductFactory1();
        Product product1 = factory1.createProduct();
        product1.doSomething();

        ProductFactory factory2 = new ConcreteProductFactory2();
        Product product2 = factory2.createProduct();
        product2.doSomething();
    }
}
