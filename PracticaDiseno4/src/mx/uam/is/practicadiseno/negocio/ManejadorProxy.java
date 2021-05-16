package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy {

	public class ManejadorImpl implements Manejador {


		@Override
		public String[] dameDatos() {
		
			System.out.println("Se invoco dame datos");
			return dameDatos();
			
		}

		@Override
		public boolean agrega(String dato) {

			System.out.println("Se invoco agrega");
			return agrega(dato);
		}

		@Override
		public boolean borra(String dato) {
			System.out.println("Se invoco borra");		
			return agrega(dato);
		}

		@Override
		public void finaliza() {
			System.out.println("Se invoco finaliza");		
			
		}

		public boolean agregaObservador(Observador o) {
			System.out.println("Se invoco agregaObservador(Observador o)");		
			return false;
		      
		}

		@Override
		public boolean quitaObservador(Observador o) {
			System.out.println("Se invoco quitaObservador(Observador o)");	
			return false;
		}

		@Override
		public void notifica() {
			
		}
		
	}
}
