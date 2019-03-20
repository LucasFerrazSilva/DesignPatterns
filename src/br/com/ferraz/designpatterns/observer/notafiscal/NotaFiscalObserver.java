package br.com.ferraz.designpatterns.observer.notafiscal;

import br.com.ferraz.designpatterns.model.notafiscal.NotaFiscal;

public interface NotaFiscalObserver {

	public void executa(NotaFiscal notaFiscal);
	
}
