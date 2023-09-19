package test;

public class Copper implements Product{
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
