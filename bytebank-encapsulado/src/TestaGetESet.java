
public class TestaGetESet {

	public static void main(String[] args) {

		Cliente lucao = new Cliente("Lucao Lindao");

		Cliente pedrinho = new Cliente("Predelas");

		Conta contaPredelas = new Conta(122, 333, pedrinho);

		Conta contaPredelas2 = new Conta(pedrinho);
		
		Conta contaLucao = new Conta(22, 443, lucao);
		
		Conta contaLucao2 = new Conta(12, 543, lucao);

		contaPredelas.depositaSaldo(100);

		contaPredelas.transfereSaldo(50, contaLucao);
		
		contaPredelas.transfereSaldo(50, contaLucao2);
		
		System.out.println(contaPredelas2.getNumero());
		
		System.out.println(contaPredelas2.getAgencia());

		System.out.println("No nosso banco temos o total de " + Conta.getTotal() + " contas "
				+ "e " + Cliente.getTotal() + " clientes!");
		
	}

}
