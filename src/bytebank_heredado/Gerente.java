package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable {

	
	// Sobre-escritura del metodo
	public double getBonificaciones() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
		
	}
	
