package abstractFactoryPattern.test.products;

import abstractFactoryPattern.test.interfaces.Telephone;

public class Phone implements Telephone
{
    @Override
    public void start() {
        System.out.println("Включение телефона...");
    }
}
