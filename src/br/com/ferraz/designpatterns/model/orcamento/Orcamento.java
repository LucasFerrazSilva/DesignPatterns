package br.com.ferraz.designpatterns.model.orcamento;

import static br.com.ferraz.designpatterns.model.orcamento.OrcamentoStatus.APROVADO;
import static br.com.ferraz.designpatterns.model.orcamento.OrcamentoStatus.EM_APROVACAO;
import static br.com.ferraz.designpatterns.model.orcamento.OrcamentoStatus.FINALIZADO;
import static br.com.ferraz.designpatterns.model.orcamento.OrcamentoStatus.REPROVADO;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<String> items;
	private OrcamentoStatus status;
	
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
		this.status = EM_APROVACAO;
	}
	
	
	public void aplicaDescontoExtra() {
		if(!this.status.podeAplicarDesconto())
			throw new RuntimeException("Não é possível aplicar desconto para o status " + this.status);
		
		this.valor -= valor * this.status.getPorcentagemDeDesconto();
	}

	public void aprova() {
		if(this.status != EM_APROVACAO)
			throw new RuntimeException("Não é possível aprovar orcamentos com status " + this.status);
		
		this.status = APROVADO;
	}

	public void reprova() {
		if(this.status != EM_APROVACAO)
			throw new RuntimeException("Não é possível reprovar orcamentos com status " + this.status);
		
		this.status = REPROVADO;		
	}

	public void finaliza() {
		if(this.status != APROVADO)
			throw new RuntimeException("Não é possível finalizar orcamentos com status " + this.status);
		
		this.status = FINALIZADO;		
	}

	
	public double getValor() {
		return valor;
	}
	
	public List<String> getItems() {
		return items;
	}

	public void add(String item) {
		this.items.add(item);
	}


	public boolean temItemMaiorQue100Reais() {
		return this.valor > 100.0;
	}
	
	public boolean temCincoItensOuMais() {
		return this.items.size() >= 5;
	}

	
}
