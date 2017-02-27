package es.luisarguello.calculadora;

public class CalculadoraArrays {
	
	private int[] operandos;
	
	public CalculadoraArrays(int[] valores){
		operandos = valores;
		System.out.println("construimos calculadoraArrays con parametros");
	}
	
	public int sumar (){
		int resultado = 0;
		for(int posicion = 0; posicion<operandos.length ; posicion++){
			resultado = resultado + operandos[posicion];
		}
		return resultado;
	}
	
	public int restar (){
		int resultado = 0;
		for(int posicion = 0; posicion<operandos.length ; posicion++){
			resultado = resultado - operandos[posicion];
		}
		return resultado;	
	}

}
