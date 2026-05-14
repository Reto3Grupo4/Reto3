package POJOS;

import java.util.ArrayList;

public class Cancion extends Audio{
	
	public Album idAlbum;
	protected ArrayList<String> artistasInvitados;
	
	public Cancion() {
		
	}

	/**
	 * @param idCancion
	 * @param idAlbum
	 * @param artistasInvitados
	 */
	public Cancion(String idAudio, Album idAlbum, ArrayList<String> artistasInvitados) {
		super(idAudio);
		this.idAlbum = idAlbum;
		this.artistasInvitados = artistasInvitados;
	}


	

	
	public Album getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Album idAlbum) {
		this.idAlbum = idAlbum;
	}

	public ArrayList<String> getArtistasInvitados() {
		return artistasInvitados;
	}

	public void setArtistasInvitados(ArrayList<String> artistasInvitados) {
		this.artistasInvitados = artistasInvitados;
	}


}
