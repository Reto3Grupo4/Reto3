package POJOS;

import java.util.Date;

public class Premium extends Cliente{

	public Date fecCaducidad;
	
	public Premium() {
		
	}

	/**
	 * @param idCliente
	 * @param fecCaducidad
	 */
	public Premium(String idCliente, Date fecCaducidad) {
		super(idCliente);
		this.fecCaducidad = fecCaducidad;
	}

	public Date getFecCaducidad() {
		return fecCaducidad;
	}

	public void setFecCaducidad(Date fecCaducidad) {
		this.fecCaducidad = fecCaducidad;
	}

}
