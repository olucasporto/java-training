
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public String saca(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			return "Voce sacou $ " + valor;

		}

		return "Voce tentou sacar $ " + valor + " mas seu saldo e insuficiente...";

	}

	public String transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {

			this.saca(valor);
			destino.deposita(valor);
			return "Voce transferiu $ " + valor + " para " + destino.titular.nome;

		}

		return "Voce nao tem dinheiro o suficiente para essa transacao";

	}
	
	public void getSaldo() {
		
		System.out.println("Você possui $ " + this.saldo + " na sua conta.");
	}
	
	public void setAgencia(int valor) {
		
		this.agencia = valor;
		
		System.out.println("O número da sua agência é " + this.agencia);
		
	}
}
