package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:mysql://10.5.6.68:3307/DestruyeSpotify";
    private static final String USER = "root";
    private static final String PASS = "Elorrieta00";

    public static Connection getConnection() throws SQLException{
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}