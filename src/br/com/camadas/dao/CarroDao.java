package br.com.camadas.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.camadas.interfaces.PadraoDao;
import br.com.camadas.modelo.Carro;

public class CarroDao implements PadraoDao<Carro>{
	
	private static List<Carro> carros = new ArrayList<Carro>();
	
	public String deleteCarro(String modelo) {
		for(Carro objeto : carros)
	  { if(objeto.getModelo().equals(modelo)) {
		  carros.remove(objeto);
		  return "removido com sucesso";
	  }
			}
		return "modelo não encontrado";
		
	}
	
	
	public Carro getCarro(String modelo) {
		for (Carro objeto: carros) {
			if(objeto.getModelo().equals(modelo)) {
				return objeto;
			}
		}
		return new Carro();

		
	}
	
	
	public boolean gravar(Carro objeto)
	{
		carros.add(objeto);
		return true;
	}
	public String exibirTudo() {
		return carros.toString();
		
	}

}
