package mx.infotec.showcase.service;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import mx.infotec.showcase.model.Usuario;

@ManagedBean(name="usuarioServiceShowcase")
@ApplicationScoped
public class UsuarioServiceImpl implements UsuarioService{
	private static final long serialVersionUID = 1L;

	public List<Usuario> obtenerUsuarios(){
		
		Usuario usuario;
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		usuario = new Usuario();
		usuario.setIdUsuario(1);
		usuario.setNombre("Isidro");
		usuario.setaPaterno("López");
		usuario.setaMaterno("Sosa");
		usuario.setCorreo("isidro.lopez@infotec.mx");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(2);
		usuario.setNombre("José Luis");
		usuario.setaPaterno("Méndez");
		usuario.setaMaterno("Santos");
		usuario.setCorreo("josel1204@gmail.com");
		listaUsuarios.add(usuario);

		usuario = new Usuario();
		usuario.setIdUsuario(3);
		usuario.setNombre("Martín");
		usuario.setaPaterno("Martínez");
		usuario.setaMaterno("Soto");
		usuario.setCorreo("jm0187@gmail.com");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(4);
		usuario.setNombre("Isidro");
		usuario.setaPaterno("López");
		usuario.setaMaterno("Sosa");
		usuario.setCorreo("isidro.lopez@infotec.mx");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(5);
		usuario.setNombre("José Luis");
		usuario.setaPaterno("Méndez");
		usuario.setaMaterno("Santos");
		usuario.setCorreo("josel1204@gmail.com");
		listaUsuarios.add(usuario);

		usuario = new Usuario();
		usuario.setIdUsuario(6);
		usuario.setNombre("Martín");
		usuario.setaPaterno("Martínez");
		usuario.setaMaterno("Soto");
		usuario.setCorreo("jm0187@gmail.com");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(7);
		usuario.setNombre("Isidro");
		usuario.setaPaterno("López");
		usuario.setaMaterno("Sosa");
		usuario.setCorreo("isidro.lopez@infotec.mx");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(8);
		usuario.setNombre("José Luis");
		usuario.setaPaterno("Méndez");
		usuario.setaMaterno("Santos");
		usuario.setCorreo("josel1204@gmail.com");
		listaUsuarios.add(usuario);

		usuario = new Usuario();
		usuario.setIdUsuario(9);
		usuario.setNombre("Martín");
		usuario.setaPaterno("Martínez");
		usuario.setaMaterno("Soto");
		usuario.setCorreo("jm0187@gmail.com");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(10);
		usuario.setNombre("Isidro");
		usuario.setaPaterno("López");
		usuario.setaMaterno("Sosa");
		usuario.setCorreo("isidro.lopez@infotec.mx");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setIdUsuario(11);
		usuario.setNombre("José Luis");
		usuario.setaPaterno("Méndez");
		usuario.setaMaterno("Santos");
		usuario.setCorreo("josel1204@gmail.com");
		listaUsuarios.add(usuario);

		usuario = new Usuario();
		usuario.setIdUsuario(12);
		usuario.setNombre("Martín");
		usuario.setaPaterno("Martínez");
		usuario.setaMaterno("Soto");
		usuario.setCorreo("jm0187@gmail.com");
		listaUsuarios.add(usuario);
		
		return listaUsuarios;
		
	}
}