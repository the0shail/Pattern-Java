package abstractFactoryPattern.source;

public class Main
{
    public static void main(String[] args)
    {
        // Создается конкретная фабрика по производству машин
        AbstractFactory factory1 = new ConcreteFactory1();

        // Создается продукт - машина 1
        ProductA productA1 = factory1.createProductA();
        // Создается продукт - машина 2
        ProductB productB1 = factory1.createProductB();

        // Машина один делает операцию А
        productA1.operationA();
        // Машина два делает операцию Б
        productB1.operationB();

        // Создается конкретная фабрика по производству Компьютеров
        AbstractFactory factory2 = new ConcreteFactory2();

        // Создается продукт - компьютеров 1
        ProductA productA2 = factory2.createProductA();
        // Создается продукт - компьютеров 2
        ProductB productB2 = factory2.createProductB();

        // Компьютер 1 делает операцию А
        productA2.operationA();
        // Компьютер 2 делает операцию Б
        productB2.operationB();
    }
}
