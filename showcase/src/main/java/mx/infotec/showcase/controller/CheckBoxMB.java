package mx.infotec.showcase.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import mx.infotec.showcase.model.Usuario;

/**
 * Clase encargada del manejo del componente CheckBox.
 * @author Francisco Manuel Carrasco Lezama
 * @version 1.0 
 * @since 24/02/2015
 */
@ManagedBean
public class CheckBoxMB implements Serializable {
	private static final long serialVersionUID = 876661843175813531L;
	private Usuario usuario;
	
	@PostConstruct
	public void init(){
		 usuario = new Usuario();
	}
	/**
	 * Método que se ejecuta al mandar el request de la página
	 * y muestra la el valor del la bandera registrado.
	 */
	public void click() {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
	    		  "Usuario Registrado: "+this.usuario.isRegistrado(),""));
	 }
	
	//Getters Setters 
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}