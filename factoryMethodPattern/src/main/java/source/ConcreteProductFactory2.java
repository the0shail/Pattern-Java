package source;

public class ConcreteProductFactory2 implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
