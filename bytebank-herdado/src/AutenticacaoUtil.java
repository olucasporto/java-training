
public class AutenticacaoUtil {
	private int senhaSistemaInterno;

	public void setSenha(int senha) {
		this.senhaSistemaInterno = senha;
	}

	public boolean autentica(int senha) {
		if (this.senhaSistemaInterno == senha) {
			return true;
		} else {
			return false;
		}
	}
}
