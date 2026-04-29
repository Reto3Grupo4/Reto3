package POJOS;

import java.util.Date;

public class PlayList {

	public int idPlaylist;
	public String titulo;
	public Date fecCreacion;
	public Cliente idCliente;
	
	public PlayList() {
		
	}

	/**
	 * @param idPlaylist
	 * @param titulo
	 * @param fecCreacion
	 * @param idCliente
	 */
	public PlayList(int idPlaylist, String titulo, Date fecCreacion, Cliente idCliente) {
		this.idPlaylist = idPlaylist;
		this.titulo = titulo;
		this.fecCreacion = fecCreacion;
		this.idCliente = idCliente;
	}

	public int getIdPlaylist() {
		return idPlaylist;
	}

	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecCreacion() {
		return fecCreacion;
	}

	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

}
