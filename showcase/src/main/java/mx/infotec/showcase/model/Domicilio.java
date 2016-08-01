package mx.infotec.showcase.model;

import java.io.Serializable;

/**
 * Descripción: Esta clase representa un elemento 
 * Domicilio del Usuario.
 * @author Isidro López Sosa 
 * @version 1.0
 * @since 24/02/2015
 */
public class Domicilio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String calle;
	private int numExterior;
	private int numInterior;
	private String colonia;
	private String municipio;
	private String estado;
	private int codigoPostal;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumExterior() {
		return numExterior;
	}
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}
	public int getNumInterior() {
		return numInterior;
	}
	public void setNumInterior(int numInterior) {
		this.numInterior = numInterior;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
