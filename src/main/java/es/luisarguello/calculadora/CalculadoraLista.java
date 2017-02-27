package es.luisarguello.calculadora;

import java.util.List;

public class CalculadoraLista {
	
	private List<Integer> operandos;
	
	public CalculadoraLista(List<Integer> valores){
		operandos = valores;
		System.out.println("construimos calculadoraLista con parametros");
	}
	
	public int sumar (){
		int resultado = 0;
		for(int posicion = 0; posicion<operandos.size() ; posicion++){
			resultado = resultado + operandos.get(posicion);
		}
		return resultado;
	}
	
	public int restar (){
		int resultado = 0;
		for(int posicion = 0; posicion<operandos.size() ; posicion++){
			resultado = resultado - operandos.get(posicion);
		}
		return resultado;	
	}


}
