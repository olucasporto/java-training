
public class TestaContaSemCliente {

	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();

		//e aqui botamos um objeto dentro do objeto
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);
		
	}
	
}