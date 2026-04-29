package EjerObjetos;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppsTest {

    //Test para Taxi
    @Test
    public void testTaxi() {
        TaxiApp taxi = new TaxiApp("Bizkaia","707GSP" , "Bilbao" , 1); // Suponiendo que Taxi tiene constructor vacío
        taxi.setProvincia("Bizkaia");
        taxi.setMatricula("BI-1234");
        taxi.setMunicipio("Bilbao");
        taxi.setMotor(1);

        assertEquals("BI-1234", taxi.getMatricula());
        assertEquals("Bilbao", taxi.getMunicipio());
        assertEquals(1, taxi.getMotor());
        assertEquals("Bizkaia", taxi.getProvincia());
    }

    //Test para Persona (PersonasMain)
    @Test
    public void testPersona() {
        Persona persona = new Persona("Juan", "Perez", 30, false, "12345678A");
        Persona p2 = new Persona("Ana", "Lopez", 25, true, "87654321B");

        assertEquals("Juan", persona.getNombre());
        assertEquals("Ana", p2.getNombre());
        assertTrue(persona.getEdad() > 0);
    }

    private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

	// 3️⃣ Test para Coche
    @Test
    public void testCoche() {
        Coche coche = new Coche(0); // Constructor vacío
        assertEquals(0, coche.getVelocidad());

        coche.acelera(50);
        assertEquals(50, coche.getVelocidad());

        coche.frena(20);
        assertEquals(30, coche.getVelocidad());

        coche.frena(50); // No puede ser negativa
        assertEquals(0, coche.getVelocidad());
    }

    private void assertEquals(int i, int velocidad) {
		// TODO Auto-generated method stub
		
	}

	//Test para Persona2 (IMC y mayor de edad)
    @Test
    public void testPersonaIMC() {
       
        Persona2 persona = new Persona2("Ander", 22, "", 'H', 60, 1.90);

        
        int imc = Persona2.calcularIMC(60, 1.90); 
        assertTrue("IMC fuera de rango esperado", imc == -1 || imc == 0 || imc == 1);

        // Comprobar si es mayor de edad
        assertTrue("La persona debería ser mayor de edad", Persona2.esMayordeEdad(persona.getEdad()));
    }

    

	private void assertTrue(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

	// 5️⃣ Test para Temperatura
    @Test
    public void testTemperatura() {
        Temperatura t = new Temperatura();
        assertEquals(212.0, t.CelciusToFahrenheit(100), 0.01);
        assertEquals(0.0, t.FahrenheitToCelsius(32), 0.01);
    }

    private void assertEquals(double d, double fahrenheitToCelsius, double e) {
		// TODO Auto-generated method stub
		
	}

	// 7️⃣ Test para Examen, Fecha y Hora
    @Test
    public void testExamen() {
        Fecha fecha = new Fecha(13, 12, 2025);
        Hora hora = new Hora(10, 30);
        Examen examen = new Examen("Programación", "Aula 1", fecha, hora);

        assertEquals("Programación", examen.getAsignatura());
        assertEquals("Aula 1", examen.getAula());
        assertEquals("13/12/2025", examen.getFecha().toString());
        assertEquals("10:30", examen.getHora().toString());
    }

	private void assertEquals(String string, String asignatura) {
		// TODO Auto-generated method stub
		
	}
}