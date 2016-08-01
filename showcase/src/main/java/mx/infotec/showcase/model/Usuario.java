package mx.infotec.showcase.model;

import java.io.Serializable;
import java.util.Date;
/**
 * Descripción: Esta clase representa un elemento 
 * Usuario.
 * @author Francisco Manuel Carrasco Lezmaa 
 * @version 1.0
 * @since 23/02/2015
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 2889829458038675871L;
	
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String correo;
	private Date fechaNacimiento;
	private String telefono;
	private boolean registrado;
	private int idUsuarioPadre;
	private int idUsuario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isRegistrado() {
		return registrado;
	}
	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}
	public int getIdUsuarioPadre() {
		return idUsuarioPadre;
	}
	public void setIdUsuarioPadre(int idUsuarioPadre) {
		this.idUsuarioPadre = idUsuarioPadre;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
