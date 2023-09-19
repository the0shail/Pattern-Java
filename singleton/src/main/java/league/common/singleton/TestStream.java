package league.common.singleton;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class TestStream {
    private static final String URL_DATABASE = "jdbc:sqlite:C:src/main/resources/database";
    private static TestStream instance;
    private Connection connection;
    public double random;

    private TestStream(double random) {
        this.random = random;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL_DATABASE);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized TestStream getInstance(double random) {
        if (instance == null) {
            instance = new TestStream(random);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
