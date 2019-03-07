package br.com.ferraz.designpatterns.model;

public class DescontoPorMaisDeQuinhentosReais extends Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() > 500.0 ? orcamento.getValor() * 0.01 : this.desconto.calcula(orcamento));
	}

}
