package Aplicacion;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class testLogin{
	
	private static Aplicacion app;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		try {
			app = new Aplicacion();
		}catch(Exception error) {
			error.printStackTrace();
		}
		
		app.usuarioRegistrado = "Ander";
		app.claveRegistrada = "Elorrieta00";
		
	}

	@Test
	public void testLoginUsuarioCorrecto() {
		
		boolean resultado = app.comprobarLogin("Ander", "Elorrieta00");
		assertTrue(resultado);
	}

	@Test
	public void testLoginUsuarioIncorrecto() {
		
		boolean resultado = app.comprobarLogin("Jon", "Elorrieta00");
		assertFalse(resultado);
	}
	
	@Test
	public void testLoginClaveCorrecto() {
		
		boolean resultado = app.comprobarLogin("Ander", "Elorrieta00");
		assertTrue(resultado);
	}
	
	@Test
	public void testClaveIncorrecto() {
		
		boolean resultado = app.comprobarLogin("Ander", "1234");
		assertFalse(resultado);
	}
}
