
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		Conta conta2 = new Conta();
		
		Cliente lucao = new Cliente(); 
		
		Cliente pedrinho = new Cliente();

		conta1.setTitular(pedrinho);
		
		conta2.setTitular(lucao);
		
		pedrinho.setNome("Predelas");
		
		lucao.setNome("Lucao Lindao");
		
		conta1.depositaSaldo(100);
		
		conta1.transfereSaldo(50, conta2);
		
	}
	
}
