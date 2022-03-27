
public class Administrador extends Funcionario implements Autenticavel {

	private int senhaSistemaInterno;

	public Administrador() {

	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao de Administrador (50)");
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.senhaSistemaInterno = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senhaSistemaInterno == senha) {
			return true;
		} else {
			return false;
		}
	}

}
