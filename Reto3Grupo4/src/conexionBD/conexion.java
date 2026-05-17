package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/destruyeSpotify1";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException{
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}