
public class TesteContas {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(10, 20);
		Conta cp = new ContaPoupanca(30, 40);

		Cliente lucao = new Cliente();

		cc.setTitular(lucao);
		cp.setTitular(lucao);

		cc.deposita(100);
		cp.deposita(300);

		cc.transfere(100, cp);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
