package psc.Aula3;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection(){
        final String usuario = "root",
                senha = "1234",
                host = "localhost",
                porta= "3306",
                db = "db_pessoas";
        Connection c;
        try {
            c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db, usuario, senha
            );
            if (c == null)
                System.out.println("Nao foi possivel conectar a database " + db);
            else System.out.println("Conectado a database " + db + " com sucesso!");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
