package mx.infotec.showcase.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import mx.infotec.showcase.model.Usuario;

/**
 * Clase encargada del manejo del componente calendario.
 * 
 * @author Francisco Manuel Carrasco Lezama 
 * @version 1.0
 * @since 23/02/2015
 */
@ManagedBean
public class CalendarMB implements Serializable {
	
	private static final long serialVersionUID = -5705078343518702104L;
	private Usuario usuario;
	
	
	@PostConstruct
	public void init(){
		 usuario = new Usuario();
	}
	/**
	 * Método que se ejecuta al mandar el request de la página
	 * y muestra la fecha seleccionada
	 */
	public void click() {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fecha de Nacimeinto Seleccionada: "+
	    		  format.format(this.usuario.getFechaNacimiento()),""));
	 }

	//Getters Setters
	 
	 public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
