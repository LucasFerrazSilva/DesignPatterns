package br.com.ferraz.designpatterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.ferraz.designpatterns.model.notafiscal.ItemDaNota;
import br.com.ferraz.designpatterns.model.notafiscal.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto = 0.0;
	private double impostos = 0.0;
	private List<ItemDaNota> itens = new ArrayList<>();
	private String observacoes;
	private Calendar dataEmissao;

	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;		
		
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, observacoes, itens);
	}
	
}
