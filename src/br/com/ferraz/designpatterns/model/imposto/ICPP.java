package br.com.ferraz.designpatterns.model.imposto;

import br.com.ferraz.designpatterns.model.orcamento.Orcamento;

public class ICPP extends ImpostoTemplate {
	
	public ICPP() {}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	
	@Override
	protected double taxaMinima(Orcamento orcamento) {
		return 0.1;
	}

	@Override
	protected double taxaMaxima(Orcamento orcamento) {
		return 0.2;
	}

	@Override
	protected boolean deveUsarTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500 && orcamento.temItemMaiorQue100Reais();
	}

}
