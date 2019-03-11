package br.com.ferraz.designpatterns.builder;

import br.com.ferraz.designpatterns.model.Orcamento;
import br.com.ferraz.designpatterns.model.desconto.Desconto;

public class DescontoBuilder {

	private Desconto primeiroDesconto;
	private Desconto ultimoDesconto;
	
	
	public DescontoBuilder with(Desconto desconto) {
		if(this.primeiroDesconto == null) {
			this.primeiroDesconto = desconto;
			this.ultimoDesconto = desconto;			
		}
		else {		
			this.ultimoDesconto.setProximoDesconto(desconto);
			this.ultimoDesconto = desconto;
		}
		
		return this;
	}
	
	public double calcula(Orcamento orcamento) {
		return this.primeiroDesconto.calcula(orcamento);
	}
	
}
