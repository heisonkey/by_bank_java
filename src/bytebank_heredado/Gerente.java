package bytebank_heredado;

public class Gerente extends Funcionario{

	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	// Sobre-escritura del metodo
	public double getBonificaciones() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		
		return super.getSalario() + this.getSalario() * 0.5;
	}
		
	}
	
