package pojos;

import java.util.Date;

public class Album {
	public String idAlbum;
	public String titulo;
	public Date año;
	public String genero;
	public String imagen;
	public Musico idMusico;
	
	
	public Album(String idAlbum, String titulo, Date año, String genero, String imagen, Musico idMusico) {
		this.idAlbum = idAlbum;
		this.titulo = titulo;
		this.año = año;
		this.genero = genero;
		this.imagen = imagen;
		this.idMusico = idMusico;
	}
	public Album() {
		
	}
	/**
	 * @return the idAlbum
	 */
	public String getIdAlbum() {
		return idAlbum;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return the año
	 */
	public Date getAño() {
		return año;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}
	/**
	 * @return the idMusico
	 */
	public Musico getIdMusico() {
		return idMusico;
	}
	/**
	 * @param idAlbum the idAlbum to set
	 */
	public void setIdAlbum(String idAlbum) {
		this.idAlbum = idAlbum;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(Date año) {
		this.año = año;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	/**
	 * @param idMusico the idMusico to set
	 */
	public void setIdMusico(Musico idMusico) {
		this.idMusico = idMusico;
	}
	

}
