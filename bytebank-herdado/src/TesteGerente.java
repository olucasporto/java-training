
public class TesteGerente {

	public static void main(String[] args) {

		Autenticavel referencia = new Cliente();

		Gerente lucao = new Gerente();
		lucao.setNome("Lucas Porto");
		lucao.setCpf("03334516");
		lucao.setSalario(3000);

		System.out.println(lucao.getNome());
		System.out.println(lucao.getCpf());
		System.out.println(lucao.getSalario());

		lucao.setSenha(2222);

		boolean autenticou = lucao.autentica(2222);
		System.out.println(autenticou);

		System.out.println(lucao.getBonificacao());
	}

}
