package bytebank_heredado;

public abstract class Cuenta { 
	protected double saldo;
	private int agencia = 1;
	private int numero; 
	private Cliente titular = new Cliente();
	
	private static int total;
	
	public Cuenta () {
		
	}
	
	public Cuenta(int agencia, int numero) {
			this.agencia = agencia;
			this.setNumero(numero);
			System.out.println("Estoy Creando una cuenta");
			
			Cuenta.total++;
		
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca (double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean transfiere (double valor,Cuenta destino){
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
	
	
}