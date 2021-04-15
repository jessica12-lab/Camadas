package br.com.camadas.bo;

import br.com.camadas.dao.CarroDao;
import br.com.camadas.modelo.Carro;

public class CarroBo {
	
	public static String apagarCarro(String modelo) {
		if(modelo.length()<2) {
			return "modelo não encontrado";
		}
		return new CarroDao().deleteCarro(modelo.toUpperCase());
	}
	
	public static Carro pesquisarModelo(String modelo) {
		if (modelo.length()<2) {
			return new Carro();
		}
		return new CarroDao().getCarro(modelo.toUpperCase());
	}
	
	public static String exibirCarros() {
		return new CarroDao().exibirTudo();
	}
	

	public static boolean novo(Carro objeto) {
		if(objeto.getAno()<1970) {
			return false;
		}
		if (objeto.getValor()<=0) {
			return false;
		}
		objeto.setModelo(objeto.getModelo().toUpperCase());
		objeto.setCor(objeto.getCor().toUpperCase());
		CarroDao dao = new CarroDao();
		dao.gravar(objeto);
		return true;
		
		
	}
	
	
	
	
	
	
	
	
	
}
