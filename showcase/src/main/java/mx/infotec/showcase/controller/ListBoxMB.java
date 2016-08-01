package mx.infotec.showcase.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import mx.infotec.showcase.model.Usuario;
import mx.infotec.showcase.service.UsuarioService;
/**
 * Clase encargada del manejo del componente ListBox.
 * 
 * @author Francisco Manuel Carrasco Lezama 
 * @version 1.0
 * @since 23/02/2015
 */
@ManagedBean
public class ListBoxMB implements Serializable {

	private static final long serialVersionUID = 639394922063346555L;
	private List<Usuario> listaUsuario;
	private Usuario usuario;
	
	@ManagedProperty("#{usuarioServiceShowcase}")
	private UsuarioService  usuarioService;

	@PostConstruct
	private void init() {
		usuario = new Usuario();
		listaUsuario = usuarioService.obtenerUsuarios();
	}
	
	/**
	 * Método que se ejecuta al mandar el request de la página
	 * y muestra la fecha seleccionada
	 */
	public void click() {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Id Usuario Seleccionado: "+usuario.getIdUsuarioPadre(),""));
	 }
	
	// Getters Setters
	
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
