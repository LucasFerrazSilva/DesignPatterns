package br.com.ferraz.designpatterns.model.desconto;

import br.com.ferraz.designpatterns.model.orcamento.Orcamento;

public class DescontoPorCincoItens extends Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.temCincoItensOuMais() ? orcamento.getValor() * 0.1 : super.calculaProximo(orcamento);
	}

}