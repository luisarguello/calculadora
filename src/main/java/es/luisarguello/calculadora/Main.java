package es.luisarguello.calculadora;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraInt calculator1 = new CalculadoraInt();
		int suma1 = calculator1.sumar();
		System.out.println("resultado suma: " + suma1);
		
		CalculadoraInt calculator2 = new CalculadoraInt(3, 8);
		int suma2 = calculator2.sumar();
		System.out.println("resultado suma: " + suma2);
		
		int resta2 = calculator2.restar ();
		System.out.println("resultado resta: " + resta2);
		
		int[] valores3 = {3, 7, 1, -2, 4};
		CalculadoraArrays calculator3 = new CalculadoraArrays(valores3);
		int suma3 = calculator3.sumar();
		int resta3 = calculator3.restar();
		System.out.println("resultado suma: " + suma3);
		System.out.println("resultado resta: " + resta3);
		
		List<Integer> valores4 = new ArrayList<Integer>();
		valores4.add(3);
		valores4.add(7);
		valores4.add(1);
		valores4.add(-2);
		valores4.add(4);
		CalculadoraLista calculator4 = new CalculadoraLista(valores4);
		int suma4 = calculator4.sumar();
		int resta4 = calculator4.restar();
		System.out.println("resultado suma: " + suma4);
		System.out.println("resultado resta: " + resta4);

	
	}

}
