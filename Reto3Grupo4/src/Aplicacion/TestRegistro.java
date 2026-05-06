package Aplicacion;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRegistro {

	private static Aplicacion app;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new Aplicacion();
	}

	@Test
	public void testRegistroCorrecto() {
		boolean resultado = app.comprobarRegistro("Ander", "Elorrieta00", "Elorrieta00");
		assertTrue(resultado);
	}
	
	@Test
	public void testRegistroUsuarioVacio() {
		boolean resultado = app.comprobarRegistro("", "Elorrieta00", "Elorrieta00");
		assertFalse(resultado);
	}

	@Test
	public void testRegistroClaveVacia() {
		boolean resultado = app.comprobarRegistro("Ander", "", "");
		assertFalse(resultado);
	}
	
	@Test
	public void testRegistroClavesIncorrectas() {
		boolean resultado = app.comprobarRegistro("Ander", "Elorrieta00", "1234");
		assertFalse(resultado);
	}
}
