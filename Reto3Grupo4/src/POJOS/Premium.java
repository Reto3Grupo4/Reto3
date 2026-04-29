package POJOS;

import java.util.Date;

public class Premium {

	public Cliente idCliente;
	public Date fecCaducidad;
	
	public Premium() {
		
	}

	/**
	 * @param idCliente
	 * @param fecCaducidad
	 */
	public Premium(Cliente idCliente, Date fecCaducidad) {
		super();
		this.idCliente = idCliente;
		this.fecCaducidad = fecCaducidad;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFecCaducidad() {
		return fecCaducidad;
	}

	public void setFecCaducidad(Date fecCaducidad) {
		this.fecCaducidad = fecCaducidad;
	}

}
