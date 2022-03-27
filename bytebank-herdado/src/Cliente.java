
public class Cliente implements Autenticavel {

	private int senhaSistemaInterno;

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
