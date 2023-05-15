package psc.Aula4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionF {
    private static final String host = "localhost",
            porta = "3306",
            db = "testeRun",
            usuario = "root",
            senha = "1234";

    public static Connection getConnection() {
        String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, db);
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            return null;
        }
    }
}
