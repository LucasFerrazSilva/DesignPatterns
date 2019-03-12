package br.com.ferraz.designpatterns.model.imposto;

import br.com.ferraz.designpatterns.model.Orcamento;

public abstract class ImpostoTemplate implements Imposto {

	private Imposto outroImposto;
	
	
	public ImpostoTemplate() {}
	
	public ImpostoTemplate(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	
	@Override
	public final double calcula(Orcamento orcamento) {
		double taxa = deveUsarTaxaMaxima(orcamento) ? taxaMaxima(orcamento) : taxaMinima(orcamento);
		
		double valor = orcamento.getValor() * taxa;
		
		valor += (outroImposto != null ? outroImposto.calcula(orcamento) : 0); 
		
		return valor;
	}

	protected abstract double taxaMinima(Orcamento orcamento);

	protected abstract double taxaMaxima(Orcamento orcamento);

	protected abstract boolean deveUsarTaxaMaxima(Orcamento orcamento);
	
}