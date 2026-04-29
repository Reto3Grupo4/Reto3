package POJOS;

public class Cancion {

	public String idCancion;
	public String idAlbum;
	public String artistasInvitados;
	
	public Cancion() {
		
		
	}
	
	
	/**
	 * @param idCancion
	 * @param idAlbum
	 * @param artistasInvitados
	 */
	public Cancion(String idCancion, String idAlbum, String artistasInvitados) {
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

	public String getArtistasInvitados() {
		return artistasInvitados;
	}

	public void setArtistasInvitados(String artistasInvitados) {
		this.artistasInvitados = artistasInvitados;
	}


}
