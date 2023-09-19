package league.common.singleton;

public final class MultiStream {
    private static final String URL_DATABASE = "jdbc:sqlite:C:src/main/resources/database";
    private static MultiStream instance;
    public double value;

    private MultiStream(double value) {
        this.value = value;
    }

    public static synchronized MultiStream getInstance(double value) {
        if (instance == null){
            instance = new MultiStream(value);
        }
        return instance;
    }
}
