package mx.uam.is.practicadiseno.negocio;

import java.util.ArrayList;
import java.util.List;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;

public class ManejadorImpl implements Manejador {

	// La estructura que contiene los datos
	private List <String> datos = new ArrayList <String> ();
	
	private List<Observador> ventanas = new ArrayList<Observador>();

	
	public ManejadorImpl(MapeadorDatos mapeador) {
		datos.add("Entrada 1");
		datos.add("Entrada 2");
		datos.add("Entrada 3");
	}
	/**
	 * Constructor que inicializa con algunos datos
	 *
	 */

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

	@Override
	public boolean agregaObservador(Observador o) {
		if(!o.equals("")  && !ventanas.contains(o)) {
			ventanas.add(o);
			notifica();
			return true;
		}
		return false;
	}

	@Override
	public boolean quitaObservador(Observador o) {
		System.out.println("Remueve"+ventanas.size());
		notifica();
		return ventanas.remove(o);		
	}

	@Override
	public void notifica() {
		for(Observador observa : ventanas) {

			observa.actualiza();
			
		}
		

	}
}
