
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais!");

		int idade = 18;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Você tem menos de 18 mas esta acompanhado, blz.");
				System.out.println("Seja bem vindo!");
			} else {
				System.out.println("Infelizmente você não pode entrar...");
			}
		}
	}
}
