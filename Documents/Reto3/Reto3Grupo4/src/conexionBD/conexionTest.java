package conexionBD; 

import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.*; 

public class conexionTest { 
	
	@Test 
	public void test() { 
		Connection conn = conexion.getConnection(); 
		assertNotNull ("La conexion se realiza correctamente", conn); 
		
	}
}