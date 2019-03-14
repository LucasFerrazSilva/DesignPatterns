package br.com.ferraz.designpatterns.main;

import br.com.ferraz.designpatterns.builder.NotaFiscalBuilder;
import br.com.ferraz.designpatterns.model.notafiscal.ItemDaNota;
import br.com.ferraz.designpatterns.model.notafiscal.NotaFiscal;

public class TestaNotaFiscal {

	public static void main(String[] args) {
		ItemDaNota item1 = new ItemDaNota("Item 1", 200.0);
		ItemDaNota item2 = new ItemDaNota("Item 2", 400.0);
//		
//		List<ItemDaNota> itens = Arrays.asList(item1, item2);
//		
//		double valorBruto = itens.stream().mapToDouble(ItemDaNota::getValor).sum();
//		
//		double impostos = valorBruto * 0.05;
//		
//		NotaFiscal nf = new NotaFiscal("Razao Social", "cnpj", Calendar.getInstance(), valorBruto, impostos, "Observações", itens);
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.paraEmpresa("Razao Social")
				.comCnpj("Razao Social")
				.comItem(item1)
				.comItem(item2)
				.comObservacoes("Obs")
				.naDataAtual();
		
		NotaFiscal notaFiscal = builder.constroi();
		
		System.out.println(notaFiscal.getValorBruto());
	}
	
}
