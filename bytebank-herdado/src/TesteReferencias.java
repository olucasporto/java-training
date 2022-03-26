
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario pedro = new Gerente();
		pedro.setNome("Pedro");
		pedro.setSalario(10000);

		Funcionario lucao = new Programador();
		lucao.setNome("Lucas");
		lucao.setSalario(2000);

		Funcionario andre = new EditorVideo();
		andre.setNome("Andre");
		andre.setSalario(5000);

		ControleBonificacao controle = new ControleBonificacao();

		controle.registra(pedro);
		controle.registra(lucao);
		controle.registra(andre);

		System.out.println(controle.getSoma());

	}

}
