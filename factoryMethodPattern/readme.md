
# Паттерн Фабричный метод (Factory Method)
Фабричный метод - это порождающий паттерн, который определяет интерфейс для создания объекта, но позволяет подклассам выбирать класс создаваемого объекта. Этот паттерн делегирует процесс создания объектов подклассам, что позволяет расширять и изменять логику создания объектов без изменения кода клиентской программы.

### Вот пример реализации паттерна Factory Method на Java:

В этом примере у нас есть интерфейс `Product`, который представляет продукт, и два конкретных класса продуктов `Iron` и `Copper`. Затем у нас есть интерфейс `ProductFactory`, который определяет метод `mineProduct()`, который должен быть реализован конкретными фабриками. Каждая конкретная фабрика, такая как `IronMine` и `CopperMine`, реализует метод `mineProduct()` для создания соответствующего продукта.

В клиентском коде мы можем выбирать, какой продукт создавать, создавая соответствующую фабрику и вызывая метод `mineProduct()`. Это позволяет гибко управлять процессом создания объектов и добавлять новые продукты или фабрики без изменения существующего кода.

```java
interface Product {
    void sell();
    void buy();
}

class Iron implements Product{
    public int quantity = 0;

    @Override
    public void sell() {
        if (quantity <= 0){
            System.out.println("Нет железа");
        } else {
            System.out.println("Вы продали 1 железо");
            quantity -= 1;
        }
    }

    @Override
    public void buy() {
        System.out.println("Вы купили 1 железо");
        quantity += 1;
    }
}

class Copper implements Product{
    public int quantity = 0;

    @Override
    public void sell() {
        if (quantity <= 0){
            System.out.println("Нет меди");
        } else {
            System.out.println("Вы продали 1 медь");
            quantity -= 1;
        }
    }

    @Override
    public void buy() {
        System.out.println("Вы купили 1 медь");
        quantity += 1;
    }
}

interface ProductFactory {
    Product mineProduct();
}

class IronMine implements ProductFactory{
    @Override
    public Product mineProduct() {
        return new Iron();
    }
}

class CopperMine implements ProductFactory{
    @Override
    public Product mineProduct() {
        return new Copper();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создается фабрика
        ProductFactory ironMine = new IronMine();
        // Фабрика создает железо
        Product iron = ironMine.mineProduct();
        // Железо делает свои дела
        iron.buy();
    }
}


```

