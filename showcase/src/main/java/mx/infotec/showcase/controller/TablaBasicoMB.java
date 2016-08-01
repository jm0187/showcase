package mx.infotec.showcase.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.infotec.showcase.model.Usuario;
import mx.infotec.showcase.service.UsuarioService;

@ManagedBean
@ViewScoped
public class TablaBasicoMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Usuario> listaUsuario;
	
	@ManagedProperty("#{usuarioServiceShowcase}")
	private UsuarioService  usuarioService;

	@PostConstruct
	private void init() {
		listaUsuario = usuarioService.obtenerUsuarios();
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setUsuarioService(UsuarioService  usuarioService) {
		this.usuarioService = usuarioService;
	}

}
