package br.com.ferraz.designpatterns.main;

import br.com.ferraz.designpatterns.model.Orcamento;
import br.com.ferraz.designpatterns.model.imposto.ICPP;
import br.com.ferraz.designpatterns.model.imposto.IKCV;
import br.com.ferraz.designpatterns.model.imposto.Imposto;

public class CalculaImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(2000);

		
		Imposto icpp = new ICPP();
		
		System.out.println(icpp.calcula(orcamento));

		
		Imposto ikcv = new IKCV();
		
		System.out.println(ikcv.calcula(orcamento));
		
		
		ikcv = new IKCV(new ICPP()); //Decorator
		
		System.out.println(ikcv.calcula(orcamento));
	}
	
}
