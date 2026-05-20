package Aplicacion;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRegistro {

	private static Aplicacion app;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new Aplicacion();
		app.usuarioARegistrar = "Ander";
		app.claveARegistrar = "Elorrieta00";
		app.claveAConfirmar = "Elorrieta00";
	}

	@Test
	public void testRegistroCorrecto() {
		app.getTxtUsuario_2().setText("Ander");
		app.getPfClave_2().setText("Elorrieta00");
		app.getPfConfirmar().setText("Elorrieta00");
		
		boolean resultado = app.validarRegistro();
		assertTrue(resultado);
	}
	
	@Test
	public void testRegistroUsuarioVacio() {
		app.getTxtUsuario_2().setText("");
		app.getPfClave_2().setText("Elorrieta00");
		app.getPfConfirmar().setText("Elorrieta00");
		
		boolean resultado = app.validarRegistro();
		assertFalse(resultado);
	}

	@Test
	public void testRegistroClaveVacia() {
		app.getTxtUsuario_2().setText("Ander");
		app.getPfClave_2().setText("");
		app.getPfConfirmar().setText("");
		
		boolean resultado = app.validarRegistro();
		assertFalse(resultado);
	}
	
	@Test
	public void testRegistroClavesIncorrectas() {
		app.getTxtUsuario_2().setText("Ander");
		app.getPfClave_2().setText("Elorrieta00");
		app.getPfConfirmar().setText("1234");
		
		boolean resultado = app.validarRegistro();
		assertFalse(resultado);
	}
}
