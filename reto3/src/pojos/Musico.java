package pojos;

import Enums.Descripcion;

public class Musico extends Artista{
	
	public String idMusico;
	public Descripcion descripcion;
	
	
	
	public Musico(String idMusico, Descripcion descripcion) {
		this.idMusico = idMusico;
		this.descripcion = descripcion;
	}
	
	public Musico() {
	}
	/**
	 * @return the idMusico
	 */
	public String getIdMusico() {
		return idMusico;
	}
	/**
	 * @return the descripcion
	 */
	public Descripcion getDescripcion() {
		return descripcion;
	}
	/**
	 * @param idMusico the idMusico to set
	 */
	public void setIdMusico(String idMusico) {
		this.idMusico = idMusico;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(Descripcion descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
