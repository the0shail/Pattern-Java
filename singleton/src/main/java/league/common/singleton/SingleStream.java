package league.common.singleton;

public final class SingleStream {
    private static SingleStream instance;
    public double value;

    private SingleStream(double value) {
        this.value = value;
    }

    public static SingleStream getInstance(double value) {
        if (instance == null){
            instance = new SingleStream(value);
        }
        return instance;
    }

}
