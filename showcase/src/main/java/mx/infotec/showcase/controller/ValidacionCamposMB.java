package mx.infotec.showcase.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.infotec.showcase.model.Usuario;

@ManagedBean
public class ValidacionCamposMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	@PostConstruct
	private void init() {
		usuario = new Usuario();
	}

	public void guardar(ActionEvent actionEvent) {

		String mensaje = "Usuario: " + usuario.getNombre() + " "
				+ usuario.getaPaterno() + " " + usuario.getaMaterno()
				+ " Almacenado Correctamente!!!";

		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				mensaje, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
