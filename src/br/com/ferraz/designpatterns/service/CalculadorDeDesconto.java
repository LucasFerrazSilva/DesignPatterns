package br.com.ferraz.designpatterns.service;

import br.com.ferraz.designpatterns.builder.DescontoBuilder;
import br.com.ferraz.designpatterns.model.Orcamento;
import br.com.ferraz.designpatterns.model.desconto.DescontoPorCincoItens;
import br.com.ferraz.designpatterns.model.desconto.DescontoPorMaisDeQuinhentosReais;
import br.com.ferraz.designpatterns.model.desconto.DescontoPorProdutoPoucoVendido;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		DescontoBuilder builder = new DescontoBuilder();
		
		builder.with(new DescontoPorCincoItens())
			   .with(new DescontoPorMaisDeQuinhentosReais())
			   .with(new DescontoPorProdutoPoucoVendido());
		
		return builder.calcula(orcamento);
	}
	
}
