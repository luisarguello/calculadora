package es.luisarguello.calculadora;

public class CalculadoraInt {
	

	protected int operando1 = 0; 
	protected int operando2 = 0;
	
	public CalculadoraInt (){
		System.out.println("construimos calculadoraInt sin parametros");
	}
	
	public CalculadoraInt (int valor1, int valor2){
		operando1 = valor1;
		operando2 = valor2;
		System.out.println("construimos calculadoraInt con parametros");
	}
	
	
	public int sumar (){
		return operando1 + operando2;
	}
	
	public int restar (){
		return operando1 - operando2;
	}

	

}
