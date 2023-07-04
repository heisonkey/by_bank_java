package bytebank_heredado;

public class Gerente extends Autenticable {

	
	// Sobre-escritura del metodo
	public double getBonificaciones() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		
		return 2000;
	}
		
	}
	
