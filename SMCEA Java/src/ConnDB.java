

import javax.sql.ConnectionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    public static void main(String[] args) {
        try {
            //Registra o Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Abre uma conexão
            Connection conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.60.15:1521:ORCL", "RM96430", "201197");

            System.out.println("Conectado!");

            //Fecha a conexão
            conexao.close();

            //Tratamento de erro
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar no Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("O Driver JDBC não foi encontrado!");
            e.printStackTrace();
        }
    }
}