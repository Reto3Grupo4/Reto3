package POJOS;

import java.util.Date;

public class PlayList_Canciones {

	public Cancion idCancion;
	public PlayList idPlayList;
	public Date fecPlayList_Cancion;
	
	public PlayList_Canciones() {
		
	}

	
	/**
	 * @param idCancion
	 * @param idPlayList
	 * @param fecPlayList_Cancion
	 */
	public PlayList_Canciones(Cancion idCancion, PlayList idPlayList, Date fecPlayList_Cancion) {
		super();
		this.idCancion = idCancion;
		this.idPlayList = idPlayList;
		this.fecPlayList_Cancion = fecPlayList_Cancion;
	}


	public Cancion getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(Cancion idCancion) {
		this.idCancion = idCancion;
	}

	public PlayList getIdPlayList() {
		return idPlayList;
	}

	public void setIdPlayList(PlayList idPlayList) {
		this.idPlayList = idPlayList;
	}

	public Date getFecPlayList_Cancion() {
		return fecPlayList_Cancion;
	}

	public void setFecPlayList_Cancion(Date fecPlayList_Cancion) {
		this.fecPlayList_Cancion = fecPlayList_Cancion;
	}
	
}
