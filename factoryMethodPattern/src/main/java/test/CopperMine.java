package test;

public class CopperMine implements ProductFactory {
    @Override
    public Product mineProduct() {
        return new Copper();
    }
}
