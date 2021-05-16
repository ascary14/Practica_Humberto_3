/*Observador Define una dependencia uno a muchos entre 
 * objetos de tal forma que cuando el estado
 *  de un objeto cambie, sus dependientes sean
 *   notificados- en este caso actualiza*/
package mx.uam.is.practicadiseno.negocio;

public interface Observador {
	
	/**
	 * Se le notifica al observador de un cambio de estado
	 *
	 */
	public void actualiza() ;

}