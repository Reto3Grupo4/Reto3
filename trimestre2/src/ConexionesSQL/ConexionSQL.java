package ConexionesSQL;

import java.sql.*;

public class ConexionSQL {

	public static void main(String[] argumentos) {

		String url = "jdbc:mysql://localhost:33060/empresa_dam";
		String user = "dam_v";
		String pass = "elorrieta9753$";
		
		String sqlDepartamentos = "Select * from departamento";

		Connection conn = null;
		Statement  sentencia = null;
		ResultSet  resultados = null;

		try {
			// 1 - Conexión
			conn = DriverManager.getConnection(url, user, pass);
			// 2 - Preparar la sentencia
			sentencia = conn.createStatement();
			// 3 - Ejecutarlo
			resultados = sentencia.executeQuery(sqlDepartamentos);
			
			// 4 - Tratar los datos
			while(resultados.next()) {
				System.out.print(resultados.getInt("NumDep") + "   ");
				System.out.print(resultados.getString("NomDep")  + "   ");
				System.out.print(resultados.getString("Localidad") + "\n");
			}
			
			while(resultados.next()) {
				System.out.print(resultados.getInt("NumDep") + "   ");
				System.out.print(resultados.getString("NomDep")  + "   ");
				System.out.print(resultados.getString("Localidad") + "\n");
			}
			//5 - Cerrar en orden inverso
			conn.close();
		} catch (SQLException exSql) {
			System.out.println(exSql.getMessage());
		}
	}

}
