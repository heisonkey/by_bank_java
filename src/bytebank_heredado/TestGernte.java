package bytebank_heredado;

public class TestGernte {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//rente.setSalario(5000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
	
		gerente.setClave("AluraCursosOnline");
		gerente.setTipo(0);
		
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
			
		}
	
}
