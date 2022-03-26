
public class Programador extends Funcionario{
	
	public Programador() {

	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao de Programador (200)");
		return 200;
	}
	
}
