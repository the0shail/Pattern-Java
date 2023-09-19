package source;

public class ConcreteProductFactory1 implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
