package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("diego");
		diego.setDocumento("32665665559");
		diego.setSalario(2000);
		
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
