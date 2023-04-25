package psc.Aula2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection(){
        final String usuario = "root",
                senha = "anima123",
                host = "localhost",
                porta= "3306",
                db = "db_pessoas";
        Connection c;
        try {
            c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db, usuario, senha
            );
            if (c == null)
                System.out.println("1");
            else System.out.println("2");
            System.out.println("aaaaaaaaaa");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
