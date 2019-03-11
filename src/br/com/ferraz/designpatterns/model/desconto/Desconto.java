package br.com.ferraz.designpatterns.model.desconto;

import br.com.ferraz.designpatterns.model.Orcamento;

public abstract class Desconto {

	protected Desconto desconto;
	
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaProximo(Orcamento orcamento) {
		if (this.desconto != null)
			return this.desconto.calcula(orcamento);
		else 
			return 0.0;
	}
	
	
	public Desconto setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
		
		return desconto;
	}
	
}
