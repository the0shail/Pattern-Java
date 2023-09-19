
# Паттерн Абстрактная фабрика (Abstract Factory Pattern)
Паттерн "Абстрактная фабрика" (Abstract Factory Pattern) - это порождающий паттерн, который предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов без указания их конкретных классов. Этот паттерн позволяет создавать объекты с определенными характеристиками, гарантируя согласованность между ними.

### Вот пример реализации паттерна "Абстрактная фабрика" на Java:

В этом примере есть два семейства продуктов: `ProductA` и `ProductB`, каждое из которых имеет несколько конкретных реализаций. Абстрактная фабрика AbstractFactory определяет методы для создания каждого продукта из семейства. Конкретные фабрики (`ConcreteFactory1` и `ConcreteFactory2`) реализуют эти методы и создают конкретные продукты из каждого семейства.

Затем в клиентском коде можно выбирать, какое семейство продуктов создавать, создавая соответствующую конкретную фабрику и используя ее методы для создания продуктов. Этот паттерн позволяет легко добавлять новые семейства продуктов, не изменяя существующий код клиента.

```java
// Абстрактный класс продукта A
interface ProductA {
    void operationA();
}

// Конкретные классы продуктов A
class ConcreteProductA1 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA");
    }
}

// Абстрактный класс продукта B
interface ProductB {
    void operationB();
}

// Конкретные классы продуктов B
class ConcreteProductB1 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB");
    }
}

// Абстрактная фабрика
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Конкретные фабрики
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание фабрики 1
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA();
        productB1.operationB();

        // Создание фабрики 2
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA();
        productB2.operationB();
    }
}
```

