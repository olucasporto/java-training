
public class Programador extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("bonificando Editor de vídeo");
		return super.getSalario() - 500;
	}
	
}
