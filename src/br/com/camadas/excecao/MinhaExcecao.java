package br.com.camadas.excecao;

public class MinhaExcecao extends Exception{
	
	
	public static String tratar(Exception e) {
		
		if (e instanceof NullPointerException) {
			return "H� um objeto null";
		}else if (e instanceof NumberFormatException) {
			return "numero inv�lido";
		}else if( e instanceof ArrayIndexOutOfBoundsException) {
		return "vetor estourou";
		}else {
			e.printStackTrace();
			return"Exce��o n�o conhecida";
		}
		
		
		
	}
	
	
	
	

}
