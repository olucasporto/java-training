
public class Programador extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("bonificando Editor de v�deo");
		return super.getSalario() - 500;
	}
	
}
