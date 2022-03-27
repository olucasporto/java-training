
public class TesteSistema {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		Administrador administrador = new Administrador();

		gerente.setSenha(2222);

		SistemaInterno si = new SistemaInterno();

		si.autentica(gerente);

		si.autentica(administrador);

	}

}
