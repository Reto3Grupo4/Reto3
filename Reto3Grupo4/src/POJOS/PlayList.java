package POJOS;

import java.util.Date;

public class PlayList {

	private int idList;
	private String titulo;
	private Date fecCreacion;
	private Cliente idCliente;
	
	public PlayList() {
		
	}

	/**
	 * @param idList
	 * @param titulo
	 * @param fecCreacion
	 * @param idCliente
	 */
	public PlayList(int idList, String titulo, Date fecCreacion, Cliente idCliente) {
		this.idList = idList;
		this.titulo = titulo;
		this.fecCreacion = fecCreacion;
		this.idCliente = idCliente;
	}

	public int getIdList() {
		return idList;
	}

	public void setIdList(int idList) {
		this.idList = idList;
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
