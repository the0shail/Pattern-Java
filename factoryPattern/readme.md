
# Паттерн Фабрика (Factory Pattern)

`Паттерн Фабрика` -  `(Factory Pattern)` является одним из популярных порождающих паттернов проектирования в Java. Он позволяет создавать объекты без явного указания конкретного класса, делегируя процесс создания специализированным подклассам. Этот паттерн полезен, когда у вас есть иерархия классов, и вам нужно создавать объекты определенного типа, но точный тип объекта может зависеть от условий или конфигурации.

### Вот пример реализации паттерна Фабрика в Java:

В этом примере `ProductFactory` является фабрикой, которая создает объекты `Product` на основе переданного типа. Пользовательское приложение может запросить фабрику создать конкретный продукт, не зная о его конкретной реализации. Это позволяет легко добавлять новые типы продуктов, не изменяя клиентский код.

Паттерн Фабрика является основой для других порождающих паттернов, таких как Фабрика абстрактных классов и Метод фабрики.

```java
// Интерфейс продукта
interface Product {
    void doSomething();
}

// Конкретные классы продуктов
class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product A is doing something.");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product B is doing something.");
    }
}

// Фабрика для создания продуктов
class ProductFactory {
    public static Product createProduct(String productType) {
        if (productType.equals("A")) {
            return new ConcreteProductA();
        } else if (productType.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание продукта типа A
        Product productA = ProductFactory.createProduct("A");
        productA.doSomething();
        
        // Создание продукта типа B
        Product productB = ProductFactory.createProduct("B");
        productB.doSomething();
    }
}
```