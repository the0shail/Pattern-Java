package league.common.singleton;

public class Demo {
    public static void main(String[] args) {
//        TestStream test1 = TestStream.getInstance(Math.random() * 1000);
//        TestStream test2 = TestStream.getInstance(Math.random() * 1000);
//
//        System.out.println(test1.getConnection());
//        System.out.println(test1.random);
//        test1.closeConnection();
//
//        System.out.println(test2.getConnection());
//        System.out.println(test2.random);
//        test2.closeConnection();

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();

    }

    static class ThreadOne implements Runnable{
        @Override
        public void run() {
            TestStream test1 = TestStream.getInstance(Math.random() * 1000);

            System.out.println(test1.getConnection());
            System.out.println(test1.random);
            test1.closeConnection();
        }
    }
    static class ThreadTwo implements Runnable{
        @Override
        public void run() {
            TestStream test1 = TestStream.getInstance(Math.random() * 1000);

            System.out.println(test1.getConnection());
            System.out.println(test1.random);
            test1.closeConnection();
        }
    }
}
