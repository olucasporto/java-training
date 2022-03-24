
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public double getSaldo() {

		return this.saldo;
	}
	
	public void depositaSaldo(double valor) {

		this.saldo += valor;
		System.out.println("Ola " + this.titular.getNome() + ", voce depositou $ " + valor + 
				" na sua conta!" );

	}

	public double sacaSaldo(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println(this.titular.getNome() + ", voce sacou $ " + valor);
			return valor;

		}
		System.out.println(this.titular.getNome() + ", voce tentou sacar $ " + valor + 
				" mas seu saldo e insuficiente...");
		return 0;

	}

	public double transfereSaldo(double valorTransferencia, Conta contaDestino) {
		if (this.saldo >= valorTransferencia) {

			this.saldo -= valorTransferencia;
			contaDestino.saldo += valorTransferencia;
			System.out.println(this.titular.getNome() + ", voce transferiu $ " + 
			valorTransferencia + " para a conta de " + contaDestino.titular.getNome() + "!");
			
			return valorTransferencia;

		}
		
		System.out.println(this.titular.getNome() + ", voce tentou transferir $ " + valorTransferencia + " mas "
				+ "seu saldo e insuficiente");
		
		return 0;

	}

	public int getAgencia() {

		return this.agencia;
	}
	
	public void setAgencia(int agencia) {

		this.agencia = agencia;

	}
	
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero < 0) {
			System.out.println("numero nao pode ser negativo");
		} else { 
			this.numero = numero;
		}
		
	}
	
	public Cliente getTitular() {

		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
