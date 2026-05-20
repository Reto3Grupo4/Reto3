package POJOS;

import Enums.IdiomaE;

public class Idioma {
	public IdiomaE idioma;
	public String descripcion;
	
	
	public Idioma(IdiomaE idioma, String descripcion) {
		this.idioma = idioma;
		this.descripcion = descripcion;
	}
	
	public Idioma() {
		
	}
	/**
	 * @return the idioma
	 */
	public IdiomaE getIdioma() {
		return idioma;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(IdiomaE idioma) {
		this.idioma = idioma;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
