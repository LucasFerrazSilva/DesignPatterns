package br.com.ferraz.designpatterns.main;

import br.com.ferraz.designpatterns.model.orcamento.Orcamento;

public class CalculaDescontoExtra {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(4000.0);

		System.out.println(orcamento.getValor());
		
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.aprova();

		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.finaliza();

		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
	}
	
}
