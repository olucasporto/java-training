
public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(40, 200);
		cc.deposita(100);

		AcaoBolsa acao = new AcaoBolsa();

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(acao);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
