
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario lucao = new Funcionario();
		lucao.setNome("Lucas Porto");
		lucao.setCpf("000333111-22");
		lucao.setSalario(90000);

		System.out.println(lucao.getNome());
		System.out.println(lucao.getBonificacao());
	}

}
