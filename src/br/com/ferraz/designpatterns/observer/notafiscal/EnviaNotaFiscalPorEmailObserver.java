package br.com.ferraz.designpatterns.observer.notafiscal;

import br.com.ferraz.designpatterns.model.notafiscal.NotaFiscal;

public class EnviaNotaFiscalPorEmailObserver implements NotaFiscalObserver {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Nota fiscal enviada por email");
	}

}
