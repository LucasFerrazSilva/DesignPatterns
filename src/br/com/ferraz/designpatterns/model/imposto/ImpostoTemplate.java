package br.com.ferraz.designpatterns.model.imposto;

import br.com.ferraz.designpatterns.model.Orcamento;

public abstract class ImpostoTemplate implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		return orcamento.getValor() * (deveUsarTaxaMaxima(orcamento) ? taxaMaxima(orcamento) : taxaMinima(orcamento));
	}

	protected abstract double taxaMinima(Orcamento orcamento);

	protected abstract double taxaMaxima(Orcamento orcamento);

	protected abstract boolean deveUsarTaxaMaxima(Orcamento orcamento);
	
}