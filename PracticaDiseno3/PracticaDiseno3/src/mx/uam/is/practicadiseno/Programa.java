
package mx.uam.is.practicadiseno;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.vista.Ventana;
import mx.uam.is.practicadiseno.negocio.Observador;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Crea el mapedor de datos
		 MapeadorDatos mapeador = new MapeadorDatosImpl();

		 // Crea el manejadory

		 ManejadorImpl manejador = new ManejadorImpl(mapeador);


		// Crea la ventana y le pasa referencia
		Ventana[] ventana = new Ventana[4];
		ventana[0]=new Ventana(manejador);
		ventana[1]=new Ventana(manejador);
		ventana[2]=new Ventana(manejador);
		ventana[3]=new Ventana(manejador);
		
		//Ventana ventana2 = new Ventana(manejador);
		//Ventana ventana3 = new Ventana(manejador);
		//Ventana ventana4 = new Ventana(manejador);
		
		//Agregamos los observadores
		manejador.agregaObservador(ventana[0]);
		manejador.agregaObservador(ventana[1]);
		manejador.agregaObservador(ventana[2]);
		manejador.agregaObservador(ventana[3]);

		
		ventana[0].setVisible(true);
		ventana[1].setVisible(true);
		ventana[2].setVisible(true);
		ventana[3].setVisible(true);

	}

}