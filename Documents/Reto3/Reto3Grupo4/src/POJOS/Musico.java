package POJOS;

import Enums.TipoMusico;

public class Musico extends Artista{
	private TipoMusico caracteristica;
	
	public Musico(String idArtista, String nombreArtistico, String genero) {
		super(idArtista, nombreArtistico, genero);
		this.caracteristica = caracteristica;
		
	}

	/**
	 * @return the caracteristica
	 */
	public TipoMusico getCaracteristica() {
		return caracteristica;
	}

	/**
	 * @param caracteristica the caracteristica to set
	 */
	public void setCaracteristica(TipoMusico caracteristica) {
		this.caracteristica = caracteristica;
	}

	
}
