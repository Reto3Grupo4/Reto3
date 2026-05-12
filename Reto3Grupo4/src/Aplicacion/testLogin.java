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
	/*
	@Test
	public void testLoginUsuarioCorrecto() {
		app.getTxtUsuario().setText("Ander");
		app.getPf_Clave().setText("Elorrieta00");
		
		boolean resultado = app.validarLogin();
		assertTrue("El login deberia ser valido por el usuario correcto", resultado);
	}
	*/
	
	@Test
	public void testLoginUsuarioIncorrecto() {
		app.getTxtUsuario().setText("Jon");
		app.getPf_Clave().setText("Elorrieta00");
		
		
		boolean resultado = app.validarLogin();
		assertFalse("El login deberia fallar por el usuario incorrecto", resultado);
	}
	
	
	@Test
	public void testLoginClaveCorrecto() {
		app.getTxtUsuario().setText("Ander");
		app.getPf_Clave().setText("Elorrieta00");
		
		boolean resultado = app.validarLogin();
		assertTrue("El login deberia ser valido por la clave correcta",resultado);
	}

	@Test
	public void testClaveIncorrecto() {
		app.getTxtUsuario().setText("Ander");
		app.getPf_Clave().setText("1234");
		
		boolean resultado = app.validarLogin();
		assertFalse("El login deberia ser invalido por la clave incorrecta", resultado);
	}
	
}
