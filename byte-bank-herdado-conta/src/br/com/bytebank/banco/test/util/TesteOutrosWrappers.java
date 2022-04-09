package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.intValue()); // Unboxing

		Double dRef = Double.valueOf(3.2); // Autoboxing
		System.out.println(dRef.doubleValue()); // Unboxing

		Boolean bRef = Boolean.TRUE; // Autoboxing
		System.out.println(bRef.booleanValue()); // Unboxing

		Number refNumero = Integer.valueOf(29);
		Number refNumero2 = Double.valueOf(29);
		Number refNumero3 = Float.valueOf(29f);

		List<Number> lista = new ArrayList<Number>(); 
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}

}
