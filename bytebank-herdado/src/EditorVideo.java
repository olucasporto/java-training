
public class EditorVideo extends Funcionario {
	
	public EditorVideo() {

	}
	
	public double getBonificacao() {
		System.out.println("bonificando Editor de v�deo");
		return super.getSalario() - 1000;
	}
	
}
