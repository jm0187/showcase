package mx.infotec.showcase.controller;

import java.io.InputStream;
import java.io.Serializable;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 * Clase encargada del manejo del componente FileDownload
 * 
 * @author Francisco Manuel Carrasco Lezama
 * @version 1.0
 * @since 24/02/2015
 *
 */
@ManagedBean
public class FileDownloadMB implements Serializable {

	private static final long serialVersionUID = 5277084682213919895L;
	   private StreamedContent file;
	    
	   @PostConstruct 
	    public void init() {       
	        InputStream stream = ((ServletContext)FacesContext.getCurrentInstance()
	        		.getExternalContext().getContext()).getResourceAsStream("/resources/docs/Guia.docx");
	        file = new DefaultStreamedContent(stream, "application/ms-word", "Guia.docx");
	    }
	 
	    public StreamedContent getFile() {
	        return file;
	    }
}
