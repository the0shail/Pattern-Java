package abstractFactoryPattern.test;

import abstractFactoryPattern.test.factories.ComputerFactory;
import abstractFactoryPattern.test.factories.ConsoleFactory;
import abstractFactoryPattern.test.factories.PhoneFactory;
import abstractFactoryPattern.test.interfaces.Console;
import abstractFactoryPattern.test.interfaces.GameFactory;
import abstractFactoryPattern.test.interfaces.PC;
import abstractFactoryPattern.test.interfaces.Telephone;

public class Main {
    public static void main(String[] args) {
        // От основного завода создается завод по производству консолей
        GameFactory gameFactoryConsole = new ConsoleFactory();
        // Завод консолей создает консоль
        Console playstation = gameFactoryConsole.createConsole();
        // Запускается консоль
        playstation.start();

        // Аналогичным способом работает этот код
        GameFactory gameFactoryComputer = new ComputerFactory();
        PC computer = gameFactoryComputer.createComputer();
        computer.start();

        GameFactory gameFactoryPhone = new PhoneFactory();
        Telephone telephone = gameFactoryPhone.createPhone();
        telephone.start();
    }
}
