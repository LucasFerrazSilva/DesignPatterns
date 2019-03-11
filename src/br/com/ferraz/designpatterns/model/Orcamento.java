package br.com.ferraz.designpatterns.model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<String> items;
	
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
	}
	
	
	public double getValor() {
		return valor;
	}
	
	public List<String> getItems() {
		return items;
	}
	
	public boolean temCincoItensOuMais() {
		return this.items.size() >= 5;
	}

	public void add(String item) {
		this.items.add(item);
	}


	public boolean temItemMaiorQue100Reais() {
		return this.valor > 100.0;
	}
	
}
