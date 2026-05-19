package POJOS;

import java.util.Date;

public class PlayList_Canciones {

	public Audio idAudio;
	public PlayList idPlayList;
	public Date fecPlayList_Cancion;
	
	public PlayList_Canciones() {
		
	}

	
	/**
	 * @param idCancion
	 * @param idPlayList
	 * @param fecPlayList_Cancion
	 */
	public PlayList_Canciones(Audio idAudio, PlayList idPlayList, Date fecPlayList_Cancion) {
		super();
		this.idAudio = idAudio;
		this.idPlayList = idPlayList;
		this.fecPlayList_Cancion = fecPlayList_Cancion;
	}


	public Audio getIdAudio() {
		return idAudio;
	}

	public void setIdCancion(Audio idAudio) {
		this.idAudio = idAudio;
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
