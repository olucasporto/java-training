
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais!");

		int idade = 18;
		boolean maiorDeIdade = idade >= 18;

		int quantidadePessoas = 3;
		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado = false;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}

		System.out.println("Valor de maiorDeIdade = " + maiorDeIdade);
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (maiorDeIdade && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar...");
		}

	}

}