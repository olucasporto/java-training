
public class Gerente extends Funcionario {

	private int senha;

	public Gerente() {

	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao de Gerente (Salario)");
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}


}
