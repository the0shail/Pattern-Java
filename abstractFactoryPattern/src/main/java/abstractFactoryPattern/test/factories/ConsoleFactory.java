package abstractFactoryPattern.test.factories;

import abstractFactoryPattern.test.products.Playstation;
import abstractFactoryPattern.test.interfaces.Console;
import abstractFactoryPattern.test.interfaces.GameFactory;

public class ConsoleFactory implements GameFactory
{
    @Override
    public Console createConsole() {
        return new Playstation();
    }
}
