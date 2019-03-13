package br.com.ferraz.designpatterns.model.imposto;

import br.com.ferraz.designpatterns.model.orcamento.Orcamento;

public interface Imposto {

	public double calcula(Orcamento orcamento);
	
}
