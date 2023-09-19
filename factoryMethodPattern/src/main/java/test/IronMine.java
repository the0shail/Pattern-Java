package test;

public class IronMine implements ProductFactory {
    @Override
    public Product mineProduct() {
        return new Iron();
    }
}
