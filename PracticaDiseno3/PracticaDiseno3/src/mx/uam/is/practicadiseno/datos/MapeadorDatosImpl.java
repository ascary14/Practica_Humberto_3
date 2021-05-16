package mx.uam.is.practicadiseno.datos;

import java.util.ArrayList;
import java.util.List;

public class MapeadorDatosImpl implements MapeadorDatos {
	// La estructura que contiene los datos
	private List<String> datos = new ArrayList<String>();
	
	public MapeadorDatosImpl() {
		// TODO Auto-generated constructor stub
		datos.add("Entrada Mapeador 1");
		datos.add("Entrada Mapeador 2");
		datos.add("Entrada Mapeador 3");
	}
	
	
	/**
	 * Agrega datos a la lista
	 * @param dato, es el dato a ingresar
	 * @return true si el dato no existe en la lista y se agrego
	 * false si el dato existe y por lo tanto no se agrego 
	 */
	public boolean agrega(String dato) {
		// TODO Auto-generated method stub
		if (!datos.equals("") && !datos.contains(dato)) {
			datos.add(dato);
			return true;
		}
		return false;
	}

	@Override
	public boolean borra(String dato) {
		// TODO Auto-generated method stub
		return datos.remove(dato);
	}

	@Override
	public String[] dameDatos() {
		// Convierte la lista a un arreglo de cadenas y lo regresa
		String arregloDatos[] = new String[datos.size()];
		datos.toArray(arregloDatos);
		return arregloDatos;
	}

	@Override
	public boolean contiene(String dato) {
		// TODO Auto-generated method stub
		if(datos.contains(dato))
			return true;
		return false;
	}

}
