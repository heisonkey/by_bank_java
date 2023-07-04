package bytebank_heredado;

public abstract interface Autenticable extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave);
	
	public abstract boolean iniciarSesion(String clave); 
	
	
	
}
