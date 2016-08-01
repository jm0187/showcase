package mx.infotec.showcase.service;

import java.io.Serializable;
import java.util.List;

import mx.infotec.showcase.model.Usuario;

public interface UsuarioService extends Serializable {
	
	public List<Usuario> obtenerUsuarios();

}
