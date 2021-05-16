package mx.uam.is.practicadiseno.negocio;


	public class ManejadorProxy implements Manejador {

	

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

		public boolean agregaObservador(Observador o, ManejadorProxy manejador) {
			System.out.println("Se invoco agregaObservador(Observador o)");		
	        return manejador.agregaObservador(o);

		      
		}

		public boolean quitaObservador(Observador o, ManejadorProxy manejador) {
			System.out.println("Se invoco quitaObservador(Observador o)");	
		      return manejador.quitaObservador(o);
		}

		@Override
		public void notifica() {
			
		}

		@Override
		public boolean agregaObservador(Observador o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean quitaObservador(Observador o) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

