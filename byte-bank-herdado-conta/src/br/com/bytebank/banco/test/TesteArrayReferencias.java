package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contas = {new ContaCorrente(10, 10),new ContaCorrente(20, 20)};

		ContaCorrente cc1 = contas[0];

		ContaCorrente cc2 = contas[1];
		
		System.out.println(cc1.getNumero());
		
		System.out.println(cc2.getNumero());

		System.out.println(contas[0].getNumero());
		
		System.out.println(contas[1].getNumero());
		
	}

}
