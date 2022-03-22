
public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 300;

		if (primeiraConta == segundaConta) {
			System.out.println("A primeira e a segunda conta são iguais.");
		} else {
			System.out.println("A primeira e a segunda conta são diferentes.");
		}

		if (primeiraConta == terceiraConta) {
			System.out.println("A primeira e a terceira conta são iguais.");
		} else {
			System.out.println("A primeira e a terceira conta são diferentes.");
		}
	}
}
