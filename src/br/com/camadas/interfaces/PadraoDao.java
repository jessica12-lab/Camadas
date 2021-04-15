package br.com.camadas.interfaces;

public interface PadraoDao<T> {
	
     public	boolean gravar(T objeto);
     public String exibirTudo();

}
