package br.com.ferraz.designpatterns.model;

public abstract class Desconto {

	protected Desconto desconto;
	
	
	public abstract double calcula(Orcamento orcamento);
	
	
	public Desconto setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
		
		return desconto;
	}
	
}
