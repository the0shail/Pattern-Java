package abstractFactoryPattern.test.interfaces;

public interface GameFactory
{
    default Console createConsole(){
        return null;
    }
    default PC createComputer(){
        return null;
    }
    default Telephone createPhone(){
        return null;
    }
}
