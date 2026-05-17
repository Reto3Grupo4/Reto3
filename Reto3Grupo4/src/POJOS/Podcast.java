package POJOS;


import Enums.TipoCliente;

public class Podcast extends Audio{
	public String idPodcast;
	protected int colaboradores;
	public Audio idArtista;
	public String imagen;
	
	
	public void setIdArtista(Audio idArtista) {
		this.idArtista = idArtista;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Podcast(String idAudio, String nombre, int duracion, String archivo, TipoCliente tipo, int nReproducciones,
			String idPodcast,int colaboradores, Podcaster idPodcaster, Audio idArtista, String imagen) {
		super(idAudio, nombre, duracion, archivo, tipo, nReproducciones);
		this.idPodcast = idPodcast;
		this.colaboradores = colaboradores;
		this.idArtista = idArtista;
		this.imagen = imagen;
	}
	public Podcast(String nombre, int duracion,  int nReproducciones, int colaboradores, String imagen, String idArtista) {
		super(nombre, duracion, nReproducciones, idArtista);
		this.colaboradores = colaboradores;
		this.imagen = imagen;
	}
	public Podcast() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the colaboradores
	 */
	public int getColaboradores() {
		return colaboradores;
	}
	
	/**
	 * @param colaboradores the colaboradores to set
	 */
	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	/**
	 * @return the idPodcast
	 */
	public String getIdPodcast() {
		return idPodcast;
	}
	/**
	 * @param idPodcast the idPodcast to set
	 */
	public void setIdPodcast(String idPodcast) {
		this.idPodcast = idPodcast;
	}
	
	
	
}
