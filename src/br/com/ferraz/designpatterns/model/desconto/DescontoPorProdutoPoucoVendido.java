package br.com.ferraz.designpatterns.model.desconto;

import br.com.ferraz.designpatterns.model.orcamento.Orcamento;

public class DescontoPorProdutoPoucoVendido extends Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getItems().contains("Impressora") ? orcamento.getValor() * 0.05 : super.calculaProximo(orcamento);
	}

}
