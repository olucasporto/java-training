
public class TestaValores {
	public static void main(String[] args) {
		Cliente lucao = new Cliente("Lucao Lindao");
		Conta conta = new Conta(122, 323, lucao);
		System.out.println(conta);
	}
}
