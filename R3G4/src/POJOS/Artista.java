package POJOS;

public class Artista {

	protected String idArtista;
	public String nombreArtistico;
	protected String genero;
	protected String imagen;
	protected String descripcion;
	
	/**
	 * Método dedicado a la creacion de MUSICOS.
	 * @param idArtista
	 * @param nombreArtistico
	 * @param genero
	 */
	public Artista(String idArtista, String nombreArtistico, String genero) {
		this.idArtista = idArtista;
		this.nombreArtistico = nombreArtistico;
		this.genero = genero;
	}
	
	public Artista(String idArtista) {
		this.idArtista = idArtista;
	}
	
	
	public Artista() {
		
	}
	
	/**
	 * @param idArtista
	 * @param nombreArtistico
	 * @param genero
	 * @param imagen
	 * @param descripcion
	 */
	public Artista(String idArtista, String nombreArtistico, String genero, String imagen, String descripcion) {
		this.idArtista = idArtista;
		this.nombreArtistico = nombreArtistico;
		this.genero = genero;
		this.imagen = imagen;
		this.descripcion = descripcion;
	}


	public String getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(String idArtista) {
		this.idArtista = idArtista;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
