package bytebank_heredado;

public class Administrador extends Autenticable {

private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	
	@Override
	public double getBonificacion() {
	
		return 0;
	}
	
}
