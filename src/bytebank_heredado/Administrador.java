package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable  {

	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
		
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}
	
	
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	
	public boolean iniciarSesion(String clave) {
		return this.util.IniciarSesion(clave);
	}
	
	
}
