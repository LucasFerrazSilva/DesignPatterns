package br.com.ferraz.designpatterns.main;

import br.com.ferraz.designpatterns.model.Orcamento;
import br.com.ferraz.designpatterns.model.imposto.ICPP;
import br.com.ferraz.designpatterns.model.imposto.IKCV;

public class CalculaImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(2000);

		
		ICPP icpp = new ICPP();
		
		System.out.println(icpp.calcula(orcamento));

		
		IKCV ikcv = new IKCV();
		
		System.out.println(ikcv.calcula(orcamento));
	}
	
}
