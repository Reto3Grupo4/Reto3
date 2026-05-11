package POJOS;

import Enums.TipoCliente;

public class Podcast extends Audio{
	public String idPodcast;
	public int colaboradores;
	public Audio idArtista;
	
	
	
	public Podcast(String idAudio, String nombre, int duracion, String archivo, TipoCliente tipo, int nReproducciones,
			String idPodcast, int colaboradores, Podcaster idPodcaster) {
		super(idAudio, nombre, duracion, archivo, tipo, nReproducciones);
		this.idPodcast = idPodcast;
		this.colaboradores = colaboradores;
		this.idArtista = idArtista;
	}
	public Podcast() {
		
	}
	/**
	 * @return the idPodcast
	 */
	public String getIdPodcast() {
		return idPodcast;
	}
	/**
	 * @return the colaboradores
	 */
	public int getColaboradores() {
		return colaboradores;
	}
	/**
	 * @return the idPodcaster
	 */
	public Audio getidArtista() {
		return idArtista;
	}
	/**
	 * @param idPodcast the idPodcast to set
	 */
	public void setIdPodcast(String idPodcast) {
		this.idPodcast = idPodcast;
	}
	/**
	 * @param colaboradores the colaboradores to set
	 */
	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}
	/**
	 * @param idPodcaster the idPodcaster to set
	 */
	public void setIdPodcaster(Audio idArtista) {
		this.idArtista = idArtista;
	}
	
	
}
