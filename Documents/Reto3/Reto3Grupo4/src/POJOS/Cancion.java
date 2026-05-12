package POJOS;

import java.util.ArrayList;

public class Cancion extends Audio{

	public String idCancion;
	public String idAlbum;
	protected ArrayList<String> artistasInvitados;
	
	public Cancion() {
		
	}

	/**
	 * @param idCancion
	 * @param idAlbum
	 * @param artistasInvitados
	 */
	public Cancion(String idCancion, String idAlbum, ArrayList<String> artistasInvitados) {
		this.idCancion = idCancion;
		this.idAlbum = idAlbum;
		this.artistasInvitados = artistasInvitados;
	}


	public String getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(String idCancion) {
		this.idCancion = idCancion;
	}

	public String getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(String idAlbum) {
		this.idAlbum = idAlbum;
	}

	public ArrayList<String> getArtistasInvitados() {
		return artistasInvitados;
	}

	public void setArtistasInvitados(ArrayList<String> artistasInvitados) {
		this.artistasInvitados = artistasInvitados;
	}


}
