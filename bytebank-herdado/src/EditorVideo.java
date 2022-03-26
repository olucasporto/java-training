
public class EditorVideo extends Funcionario {
	
	public EditorVideo() {

	}
	
	public double getBonificacao() {
		System.out.println("bonificando Editor de vídeo");
		return super.getSalario() - 1000;
	}
	
}
