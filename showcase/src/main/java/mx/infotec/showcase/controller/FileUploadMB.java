package mx.infotec.showcase.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

/**
 * Clase encargada del manejo del componente FileUpload
 * 
 * @author Francisco Manuel Carrasco Lezama
 * @version 1.0
 * @since 24/02/2015
 *
 */
@ManagedBean
public class FileUploadMB implements Serializable {

	private static final long serialVersionUID = 5277084682213919895L;
	private UploadedFile file;
	/**
	 * Método que se ejecuta al lanzar la petición del usuario 
	 * y muestra mensaje de carga.
	 */
	public void upload() {
		if (file != null) {
			FacesMessage message = new FacesMessage("Exito",
					file.getFileName() + " ha sido cargado.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
}
