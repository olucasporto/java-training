
public class Gerente extends Funcionario implements Autenticavel {

	private int senhaSistemaInterno;

	public Gerente() {

	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao de Gerente (Salario)");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senhaSistemaInterno == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senhaSistemaInterno = senha;
	}

}
