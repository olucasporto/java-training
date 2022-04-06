package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias3 {

	public static void main(String[] args) {

		Object[] referencias = { new ContaPoupanca(10, 10), new ContaCorrente(20, 20) };

		ContaPoupanca cc1 = (ContaPoupanca) referencias[0];

		Conta cc2 = (Conta) referencias[1];

		System.out.println(cc1.getNumero());

		System.out.println(cc2.getNumero());

		// System.out.println(referencias[0].getNumero());

		// System.out.println(referencias[1].getNumero());

	}

}
