package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	// Array
	public static void main(String[] args) {

		int[] idades = new int[5];

		
		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
	}
}
