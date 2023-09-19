package abstractFactoryPattern.test.products;

import abstractFactoryPattern.test.interfaces.Console;

public class Playstation implements Console
{
    @Override
    public void start() {
        System.out.println("Запуск Playstation...");
    }
}
