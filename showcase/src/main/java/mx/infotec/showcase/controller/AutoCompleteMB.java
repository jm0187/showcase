package mx.infotec.showcase.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
/**
 * Clase que se encarga del manejo del componente AutoComplete 
 * @author Francisco Manuel Carrasco Lezama 
 * @version 1.0
 * @since 25/02/2015
 */
@ManagedBean
public class AutoCompleteMB implements Serializable {

	private static final long serialVersionUID = -7560150000849600690L;
	private String texto;
	
	/**
	 * Método que autocompleta una lista de números
	 * para mostrar el funcionamiento del componente
	 * autocomplete.
	 * @param query cadena de entrada.
	 * @return Lista de opciones autocompletadas.
	 */
	public List<String> completaTexto(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            results.add(query + i);
        }
         
        return results;
    }
	
	//Getters Setters
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
