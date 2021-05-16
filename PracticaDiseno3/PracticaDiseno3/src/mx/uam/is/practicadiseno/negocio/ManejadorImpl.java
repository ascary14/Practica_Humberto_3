package mx.uam.is.practicadiseno.negocio;



import java.util.ArrayList;
import java.util.List;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.vista.Ventana;

public class ManejadorImpl implements Manejador {

	// La estructura que contiene los datos
	private List <String> datos = new ArrayList <String> ();
	//Tiene una relacion de uno a muchos
	private List<Observador> observadores = new ArrayList<Observador>();
	/**
	 * Constructor que inicializa con algunos datos
	 *
	 */
	public ManejadorImpl() {
		datos.add("Entrada 1");
		datos.add("Entrada 2");
		datos.add("Entrada 3");
	}
	
	//resisa, esto se agrego 
	public ManejadorImpl(MapeadorDatos mapeador) {
		datos.add("Entrada  1");
		datos.add("Entrada  2");
		datos.add("Entrada  3");
	}
	
	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		// Convierte la lista a un arreglo de cadenas y lo regresa
		String arregloDatos [] = new String[datos.size()];
		datos.toArray(arregloDatos);
		return arregloDatos;
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		if(!dato.equals("") && !datos.contains(dato)) {
			datos.add(dato);
			notifica();
			return true;
		}
		return false;
	}

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		notifica();
		return datos.remove(dato);
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
			//System.exit(0);
	}

	// llamar actualiza() sobre todos los observadores
	public void notifica() {
		for(Observador obs : observadores) {
			obs.actualiza();
			//dameDatos();
		}
	}

	// agregar un observador a la lista de observadores
	public boolean agregaObservador(Observador o) {
		
		if(!o.equals("")  && !observadores.contains(o)) {
			observadores.add(o);
			notifica();
			return true;
		}
		return false;
		
	}
	
// quitar un observador de la lista de observadores
	public boolean quitaObservador(Observador o) {
		System.out.println("Remueve"+observadores.size());
		return observadores.remove(o);
		
	}


}
