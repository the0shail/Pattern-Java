package factoryPattern;

public class ProductFactory {
    public static Product createProduct(String productType){
        if (productType.equals("1")){
            return new ConcreteProduct1();
        } else if (productType.equals("2")) {
            return new ConcreteProduct2();
        }
        return null;
    }
}
