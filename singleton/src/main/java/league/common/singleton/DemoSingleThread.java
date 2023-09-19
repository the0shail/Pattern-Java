package league.common.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SingleStream one = SingleStream.getInstance(Math.random() * 1000);
        SingleStream two = SingleStream.getInstance(Math.random() * 1000);
        System.out.println(one.value);
        System.out.println(two.value);
    }
}
