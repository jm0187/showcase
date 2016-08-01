package mx.infotec.showcase.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Clase encargada del manejo del commpoente OneRadio.
 * @author Francisco Manuel Carrasco Lezama 
 * @version 1.0 
 * @since 25/02/2015
 */
@ManagedBean
public class OneRadioMB implements Serializable{

	private static final long serialVersionUID = -4440371845840829404L;
	private String color;
	
	public void click() {
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El color seleccionado "+color,""));
	 }

	//Getters Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
