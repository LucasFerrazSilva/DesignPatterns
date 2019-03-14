package br.com.ferraz.designpatterns.model.notafiscal;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private List<ItemDaNota> itens;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, double valorBruto, double impostos, String observacoes, List<ItemDaNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.observacoes = observacoes;
		this.itens = itens;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}
	
	
	
}
