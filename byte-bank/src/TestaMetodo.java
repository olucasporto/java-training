
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoLucas = new Conta();

		contaDoLucas.titular = "Lucas";
		
		Conta contaDoPedro = new Conta();

		contaDoPedro.titular = "Pedro";

		contaDoLucas.deposita(100);

		String transferencia = contaDoLucas.transfere(150, contaDoPedro);

		String conseguiSacar = contaDoLucas.saca(200);

		System.out.println(contaDoLucas.saldo);

		System.out.println(transferencia);

		System.out.println("O saldo na conta de " + contaDoPedro.titular + " é " + contaDoPedro.saldo);

		System.out.println(conseguiSacar);
	}

}
