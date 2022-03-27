
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel pessoa) {
		boolean autenticou = pessoa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Bem vindo ao sistema!");
		} else {
			System.out.println("Senha invalida...");
		}
	}

}
