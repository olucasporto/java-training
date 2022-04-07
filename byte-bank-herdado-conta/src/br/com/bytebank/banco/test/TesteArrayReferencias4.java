package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias4 {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
		
		System.out.println(contas.length);

		ContaCorrente cc1 = new ContaCorrente(10, 10);

		contas[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(20, 20);

		contas[1] = cc2;

		//System.out.println(cc2.getNumero());
		
		System.out.println(contas[1].getNumero());
		
		Conta ref = contas[1];
		
	}

}
