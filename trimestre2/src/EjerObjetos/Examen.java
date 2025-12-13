package EjerObjetos;

public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getAsignatura() {
    	return asignatura; 
    }
    public void setAsignatura(String asignatura) {
    	this.asignatura = asignatura; 
    }

    public String getAula() {
    	return aula; 
    }
    public void setAula(String aula) {
    	this.aula = aula; 
    }

    public Fecha getFecha() {
    	return fecha; 
    }
    public void setFecha(Fecha fecha) {
    	this.fecha = fecha; 
    }

    public Hora getHora() {
    	return hora; 
    }
    public void setHora(Hora hora) {
    	this.hora = hora; 
    }

    @Override
    public String toString() {
        return "Examen de " + asignatura + "\nAula: " + aula + "\nFecha: " + fecha + "\nHora: " + hora;
    }
}
