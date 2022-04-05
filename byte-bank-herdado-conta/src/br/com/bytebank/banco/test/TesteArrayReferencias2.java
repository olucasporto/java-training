package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias2 {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(10, 10);

		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(20, 20);

		contas[1] = cc2;

		//System.out.println(cc2.getNumero());
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		
	}

}
