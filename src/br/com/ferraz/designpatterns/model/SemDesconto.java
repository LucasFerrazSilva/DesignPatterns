package br.com.ferraz.designpatterns.model;

public class SemDesconto extends Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 0;
	}

}
