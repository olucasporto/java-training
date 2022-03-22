
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo += 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);

		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
		System.out.println("O nome do titular da segunda conta é: " + segundaConta.titular);
	}

}
