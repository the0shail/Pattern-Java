package test;

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
