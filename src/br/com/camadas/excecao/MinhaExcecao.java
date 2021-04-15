package br.com.camadas.excecao;

public class MinhaExcecao extends Exception{
	
	
	public static String tratar(Exception e) {
		
		if (e instanceof NullPointerException) {
			return "Há um objeto null";
		}else if (e instanceof NumberFormatException) {
			return "numero inválido";
		}else if( e instanceof ArrayIndexOutOfBoundsException) {
		return "vetor estourou";
		}else {
			e.printStackTrace();
			return"Exceção não conhecida";
		}
		
		
		
	}
	
	
	
	

}
