package abstractFactoryPattern.test.factories;

import abstractFactoryPattern.test.interfaces.GameFactory;
import abstractFactoryPattern.test.interfaces.Telephone;
import abstractFactoryPattern.test.products.Phone;

public class PhoneFactory implements GameFactory {
    @Override
    public Telephone createPhone() {
        return new Phone();
    }
}
