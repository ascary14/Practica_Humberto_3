package mx.uam.is.practicadiseno;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.vista.Ventana;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Crea el mapedor de datos
		MapeadorDatos mapeador = new MapeadorDatosImpl();

		// Crea el manejador

		ManejadorImpl manejador = new ManejadorImpl(mapeador);
		//ManejadorImpl manejador = new ManejadorImpl();

		// Crea las ventanas y le pasa referencia
		Ventana[] ventana = new Ventana[3];
		ventana[0]=new Ventana(manejador);
		ventana[1]=new Ventana(manejador);
		ventana[2]=new Ventana(manejador);
	

		// Muestra la ventana arrancando asi el programa
		manejador.agregaObservador(ventana[0]);
		manejador.agregaObservador(ventana[1]);
		manejador.agregaObservador(ventana[2]);
		
		
		ventana[0].setVisible(true);
		ventana[1].setVisible(true);
		ventana[2].setVisible(true);
	}

}
