
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public String saca(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			return "Você sacou " + valor;

		}

		return "Você tentou sacar " + valor + " mas seu saldo é insuficiente...";

	}

	public String transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {

			this.saca(valor);
			destino.deposita(valor);
			return "Você transferiu " + valor + " para " + destino.titular;

		}

		return "Você não tem dinheiro o suficiente para essa transação";

	}
}
