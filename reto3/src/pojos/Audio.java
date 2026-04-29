package pojos;

import Enums.Tipo;

public class Audio {

	public String idAudio;
	public String nombre;
	public int duracion;
	public String archivo;
	public Tipo tipo;
	public int nReproducciones;
	
	
	public Audio(String idAudio, String nombre, int duracion, String archivo, Tipo tipo, int nReproducciones) {
		this.idAudio = idAudio;
		this.nombre = nombre;
		this.duracion = duracion;
		this.archivo = archivo;
		this.tipo = tipo;
		this.nReproducciones = nReproducciones;
	}
	public Audio() {
		
	}
	
	
	/**
	 * @return the idAudio
	 */
	public String getIdAudio() {
		return idAudio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @return the archivo
	 */
	public String getArchivo() {
		return archivo;
	}
	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @return the nReproducciones
	 */
	public int getnReproducciones() {
		return nReproducciones;
	}
	/**
	 * @param idAudio the idAudio to set
	 */
	public void setIdAudio(String idAudio) {
		this.idAudio = idAudio;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	/**
	 * @param nReproducciones the nReproducciones to set
	 */
	public void setnReproducciones(int nReproducciones) {
		this.nReproducciones = nReproducciones;
	}
	
	
}
