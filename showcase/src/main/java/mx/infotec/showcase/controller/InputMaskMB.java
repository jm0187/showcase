package mx.infotec.showcase.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import mx.infotec.showcase.model.Usuario;
/**
 *  Clase encargada del manejo del componente inputMask.
 * @author Francisco Manuel Carrasco Lezama
 * @version 1.0
 * @since 24/02/2015
 */
@ManagedBean
public class InputMaskMB implements Serializable{

	private static final long serialVersionUID = 3415047247659296014L;
	private Usuario usuario;
	
	@PostConstruct
	public void init(){
		 usuario = new Usuario();
	}
	/**
	 * Método que se ejecuta al mandar el request de la página
	 * y muestra la el número de teléfono generado
	 */
	public void click() {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El número de teléfono es: "+
	    		  this.usuario.getTelefono(),""));
	 }

	
	//Getters Setters
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
}
