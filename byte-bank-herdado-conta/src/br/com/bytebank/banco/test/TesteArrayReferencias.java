package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = {new ContaCorrente(10, 10),new ContaCorrente(20, 20)};

		Conta cc1 = contas[0];

		Conta cc2 = contas[1];
		
		System.out.println(cc1.getNumero());
		
		System.out.println(cc2.getNumero());

		System.out.println(contas[0].getNumero());
		
		System.out.println(contas[1].getNumero());
		
	}

}
