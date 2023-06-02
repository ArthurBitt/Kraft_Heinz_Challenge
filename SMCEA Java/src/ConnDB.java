

import javax.sql.ConnectionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnDB {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USERNAME = "RM96430";
    private static final String PASSWORD = "201197";

    public static void main(String[] args) {
        try {
            conectarBancoDados();
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados.");
            exibirMensagemErro(e);
        }
    }

    private static void conectarBancoDados() throws SQLException {
        try (Connection conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

        }
    }

    private static void exibirMensagemErro(SQLException e) {
        System.err.println("Mensagem de erro: " + e.getMessage());
    }

    //INSERTS
//     private static void insertT_SMCEA_CALCULADORA_TIPO_ENERG_CONSUMIDA(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_SMCEA_CALCULADORA_TIPO_ENERG_CONSUMIDA (Id_Resultado, T_Smcea_Converte_T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel, T_Smcea_Fabrica_Id_Fabrica) VALUES (?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Resultado
//            statement.setInt(2, 1); // T_Smcea_Converte_T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel
//            statement.setInt(3, 1); // T_Smcea_Fabrica_Id_Fabrica
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Consumo_Agua(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Consumo_Agua (T_Smcea_Fabrica_Id_Fabrica, Vl_Agua_Gasta, T_Smcea_Consumo_Agua_Id) VALUES (?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // T_Smcea_Fabrica_Id_Fabrica
//            statement.setDouble(2, 10.5); // Vl_Agua_Gasta
//            statement.setInt(3, 1); // T_Smcea_Consumo_Agua_Id
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Consumo_Energia_Eletrica(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Consumo_Energia_Eletrica (T_Smcea_Fabrica_Id_Fabrica, \"Vl_Kw/h_Gasto\", T_Smcea_Consumo_Energia_Eletrica_Id) VALUES (?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // T_Smcea_Fabrica_Id_Fabrica
//            statement.setDouble(2, 20.5); // Vl_Kw/h_Gasto
//            statement.setInt(3, 1); // T_Smcea_Consumo_Energia_Eletrica_Id
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Converte(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Converte (Id_Conversao, T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel, T_Smcea_Tipos_Energia_Nao_Renovaveis_Id_Energia_Nao_Renovavel) VALUES (?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Conversao
//            statement.setInt(2, 1); // T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel
//            statement.setInt(3, 1); // T_Smcea_Tipos_Energia_Nao_Renovaveis_Id_Energia_Nao_Renovavel
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Fabrica(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Fabrica (Id_Fabrica, \"T_Smcea_Calculadora_%_Tipo_Energ_Consumida_Id_Resultado\", \"T_Smcea_Calculadora_%_Tipo_Energ_Consumida_T_Smcea_Converte_T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel\", T_Smcea_Consumo_Energia_Eletrica_T_Smcea_Consumo_Energia_Eletrica_Id, T_Smcea_Consumo_Agua_T_Smcea_Consumo_Agua_Id) VALUES (?, ?, ?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Fabrica
//            statement.setInt(2, 1); // T_Smcea_Calculadora_%_Tipo_Energ_Consumida_Id_Resultado
//            statement.setInt(3, 1); // T_Smcea_Calculadora_%_Tipo_Energ_Consumida_T_Smcea_Converte_T_Smcea_Tipo_Energias_Renovaveis_Id_Energia_Renvovavel
//            statement.setInt(4, 1); // T_Smcea_Consumo_Energia_Eletrica_T_Smcea_Consumo_Energia_Eletrica_Id
//            statement.setInt(5, 1); // T_Smcea_Consumo_Agua_T_Smcea_Consumo_Agua_Id
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Tipo_Energias_Renovaveis(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Tipo_Energias_Renovaveis (Id_Energia_Renvovavel, Nm_Energias) VALUES (?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Energia_Renvovavel
//            statement.setString(2, "Energia Renovável 1"); // Nm_Energias
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Tipos_Energia_Nao_Renovaveis(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Tipos_Energia_Nao_Renovaveis (Id_Energia_Nao_Renovavel, Nm_Energias) VALUES (?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Energia_Nao_Renovavel
//            statement.setString(2, "Energia Não Renovável 1"); // Nm_Energias
//            statement.executeUpdate();
//        }
//    }
//
//    private static void insertT_Smcea_Valida_Metas(Connection connection) throws SQLException {
//        String sql = "INSERT INTO T_Smcea_Valida_Metas (Id_Valida_Metas, T_Smcea_Calculadora_%_Tipo_Energ_Consumida_Id_Resultado, Meta_Atingida) VALUES (?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, 1); // Id_Valida_Metas
//            statement.setInt(2, 1); // T_Smcea_Calculadora_%_Tipo_Energ_Consumida_Id_Resultado
//            statement.setBoolean(3, true); // Meta_Atingida
//            statement.executeUpdate();

}