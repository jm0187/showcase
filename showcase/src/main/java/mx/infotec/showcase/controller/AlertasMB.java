package mx.infotec.showcase.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Clase encargada del manejo del componente de alertas.
 * 
 * @author Francisco Manuel Carrasco Lezama
 * @version 1.0
 * @since 25/02/2015
 */
@ManagedBean
public class AlertasMB implements Serializable {

	private static final long serialVersionUID = -5581628279772115137L;

	public void informacion() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_INFO, "Información" + "", ""));
	}

	public void warning() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_WARN, "Warning" + "", ""));
	}

	public void error() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_ERROR, "Error" + "", ""));
	}

	public void fatal() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_FATAL, "FATAL" + "", ""));
	}
}
