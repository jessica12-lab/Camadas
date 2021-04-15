package br.com.camadas.implementacao;

import javax.swing.JOptionPane;

import br.com.camadas.bo.CarroBo;
import br.com.camadas.excecao.MinhaExcecao;
import br.com.camadas.lib.Magica;
import br.com.camadas.modelo.Carro;

public class ImplementarCarro {

	private static final Carro carro = null;

	public static void main(String[] args) {

        try {
		while (JOptionPane.showInputDialog("Digite S").toUpperCase().equals("S")) {
		Carro carro = new Carro();
		carro.setAll( 
		Magica.s("modelo"),
		Magica.f("valor"),
		Magica.s("cor"),
		Magica.i("Ano"));
		System.out.println(CarroBo.novo(carro));
		}	
		
		
		
	
		System.out.println(CarroBo.exibirCarros());
	
		String modelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
		Carro resposta = CarroBo.pesquisarModelo(modelo);
		
		System.out.println("Resposta: " + resposta.toString());
		System.out.println(CarroBo.apagarCarro(modelo));
		System.out.println("Apos apagar: \n" + CarroBo.exibirCarros());
        }catch (Exception e ){
        	System.out.println(MinhaExcecao.tratar(e));
        }finally 
        {
        	
        }

	
	
	
	
	
	}
	

}
