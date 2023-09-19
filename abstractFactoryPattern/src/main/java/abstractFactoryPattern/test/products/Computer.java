package abstractFactoryPattern.test.products;

import abstractFactoryPattern.test.interfaces.PC;

public class Computer implements PC
{
    @Override
    public void start() {
        System.out.println("Запуск Компьютера...");
    }
}
