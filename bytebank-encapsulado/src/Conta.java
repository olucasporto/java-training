
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	public Conta(int agencia, int numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		Conta.total++;
	}
	
	public Conta(Cliente titular) {
		this(0, 0, titular);
	}
	

	public double getSaldo() {
		return this.saldo;
	}

	public void depositaSaldo(double valor) {
		this.saldo += valor;
		System.out.println("Ola " + this.titular.getNome() + ", voce depositou $ " + valor + " na " + "sua conta!");
	}

	public void sacaSaldo(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println(this.titular.getNome() + ", voce sacou $ " + valor);
		} else {
			System.out.println(
					this.titular.getNome() + ", voce tentou sacar $ " + valor + " mas seu saldo e insuficiente...");
		}
	}

	public void transfereSaldo(double valorTransferencia, Conta contaDestino) {
		if (this.saldo >= valorTransferencia) {
			this.saldo -= valorTransferencia;
			contaDestino.saldo += valorTransferencia;
			System.out.println(this.titular.getNome() + ", voce transferiu $ " + valorTransferencia
					+ " para a conta de " + contaDestino.titular.getNome() + "!");
		} else {
			System.out.println(this.titular.getNome() + ", voce tentou transferir $ " + valorTransferencia
					+ " mas seu saldo e insuficiente");
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}
