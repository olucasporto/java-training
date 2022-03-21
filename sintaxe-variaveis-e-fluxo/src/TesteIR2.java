
public class TesteIR2 {

	public static void main(String[] args) {

		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
		// De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
		// De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

		double salario = 3300.0;

		boolean aliquota1 = salario >= 1900.0 && salario <= 2800.0;
		double valorAliquota1 = 7.5;
		double deducaoAliquota1 = 142;

		boolean aliquota2 = salario >= 2800.01 && salario <= 3751.0;
		double valorAliquota2 = 15;
		double deducaoAliquota2 = 350;

		boolean aliquota3 = salario >= 3751.01 && salario <= 4664.0;
		double valorAliquota3 = 22.5;
		double deducaoAliquota3 = 636;

		if (aliquota1) {
			System.out.println("A sua aliquota é de " + valorAliquota1 + "%");
			System.out.println("Você pode deduzir até R$ " + deducaoAliquota1);
		} else {
			if (aliquota2) {
				System.out.println("A sua aliquota é de " + valorAliquota2 + "%");
				System.out.println("Você pode deduzir até R$ " + deducaoAliquota2);
			} else {
				if (aliquota3) {
					System.out.println("A sua aliquota é de " + valorAliquota3 + "%");
					System.out.println("Você pode deduzir até R$ " + deducaoAliquota3);
				}
			}
		}
	}
}