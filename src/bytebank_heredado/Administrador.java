package bytebank_heredado;

public class Administrador extends FuncionarioAutenticable {

private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	
	
	public double getBonificacion() {
	
		return 0;
	}
	
}
