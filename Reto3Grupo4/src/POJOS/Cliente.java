package POJOS;

import java.util.Date;

import Enums.IdiomaE;
import Enums.TipoCliente;

public class Cliente {

	public String idCliente;
	public String nombre;
	public String apellido;
	public IdiomaE idioma;
	public String usuario;
	public String clave;
	public Date fecNacimiento;
	public Date fecRegistro;
	public TipoCliente tipoCliente;
	
	public Cliente() {
		
	}
	
	public Cliente (String usuario, String clave) {
		this.usuario = usuario;
		this.clave= clave;
	}

	
	/**
	 * @param idCliente
	 * @param nombre
	 * @param apellido
	 * @param idioma
	 * @param usuario
	 * @param clave
	 * @param fecNacimiento
	 * @param fecRegistro
	 * @param tipoCliente
	 */
	public Cliente(String idCliente, String nombre, String apellido, IdiomaE idioma, String usuario, String clave, Date fecNacimiento, Date fecRegistro, TipoCliente tipoCliente) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idioma = idioma;
		this.usuario = usuario;
		this.clave = clave;
		this.fecNacimiento = fecNacimiento;
		this.fecRegistro = fecRegistro;
		this.tipoCliente = tipoCliente;
	}
	public Cliente(String nombre, String apellido, IdiomaE idioma, String usuario, String clave, Date fecNacimiento, Date fecRegistro, TipoCliente tipoCliente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idioma = idioma;
		this.usuario = usuario;
		this.clave = clave;
		this.fecNacimiento = fecNacimiento;
		this.fecRegistro = fecRegistro;
		this.tipoCliente = tipoCliente;
	}
	
	public Cliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public IdiomaE getIdioma() {
		return idioma;
	}

	public void setIdioma(IdiomaE idioma) {
		this.idioma = idioma;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public Date getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
