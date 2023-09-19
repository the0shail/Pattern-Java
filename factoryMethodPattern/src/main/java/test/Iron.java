package test;

public class Iron implements Product{
    public int quantity = 0;

    @Override
    public void sell() {
        if (quantity <= 0){
            System.out.println("Нет железа");
        } else {
            System.out.println("Вы продали 1 железо");
            quantity -= 1;
        }
    }

    @Override
    public void buy() {
        System.out.println("Вы купили 1 железо");
        quantity += 1;
    }
}
