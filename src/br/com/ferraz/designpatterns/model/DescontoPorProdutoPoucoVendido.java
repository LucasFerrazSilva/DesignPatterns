package br.com.ferraz.designpatterns.model;

public class DescontoPorProdutoPoucoVendido extends Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getItems().contains("Impressora") ? orcamento.getValor() * 0.05 : this.desconto.calcula(orcamento));
	}

}
