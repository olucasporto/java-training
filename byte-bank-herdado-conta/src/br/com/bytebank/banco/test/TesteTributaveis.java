package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.AcaoBolsa;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

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
