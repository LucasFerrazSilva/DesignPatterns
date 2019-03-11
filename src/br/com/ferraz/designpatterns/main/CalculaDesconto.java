package br.com.ferraz.designpatterns.main;

import static java.lang.String.valueOf;

import br.com.ferraz.designpatterns.model.Orcamento;
import br.com.ferraz.designpatterns.service.CalculadorDeDesconto;

public class CalculaDesconto {

	public static void main(String[] args) {
		CalculadorDeDesconto calculador = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(400.0);
		
		orcamento.add("Impressora");
		
		for(int i = 0 ; i < 1 ; i++)
			orcamento.add(valueOf(i));
		
		System.out.println(calculador.calcula(orcamento));
	}
	
}
