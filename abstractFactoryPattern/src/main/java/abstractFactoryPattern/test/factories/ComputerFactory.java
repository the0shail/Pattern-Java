package abstractFactoryPattern.test.factories;

import abstractFactoryPattern.test.interfaces.GameFactory;
import abstractFactoryPattern.test.interfaces.PC;
import abstractFactoryPattern.test.products.Computer;

public class ComputerFactory implements GameFactory {
    @Override
    public PC createComputer() {
        return new Computer();
    }
}
