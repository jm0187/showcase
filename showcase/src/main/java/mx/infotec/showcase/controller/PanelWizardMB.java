package mx.infotec.showcase.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

import mx.infotec.showcase.model.Domicilio;
import mx.infotec.showcase.model.Usuario;
@ManagedBean
@ViewScoped
public class PanelWizardMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private Domicilio domicilio;

	@PostConstruct
	private void init() {
		usuario = new Usuario();
		domicilio = new Domicilio();
	}
	
	private boolean skip;
	
	public void save() {       
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + usuario.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
	
	
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
