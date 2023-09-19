public class Main {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("1");
        product1.doSomething();

        Product product2 = ProductFactory.createProduct("2");
        product2.doSomething();
    }
}
