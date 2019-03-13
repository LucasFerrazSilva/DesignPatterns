package br.com.ferraz.designpatterns.model.orcamento;

public enum OrcamentoStatus {

	EM_APROVACAO(true, 0.05),
	APROVADO(true, 0.02),
	REPROVADO(false, 0),
	FINALIZADO(false, 0);

	
	private boolean podeAplicarDesconto;
	private double porcentagemDeDesconto;
	
	
	private OrcamentoStatus(boolean podeAplicarDesconto, double porcentagemDeDesconto) {
		this.podeAplicarDesconto = podeAplicarDesconto;
		this.porcentagemDeDesconto = porcentagemDeDesconto;
	}
	
	
	public boolean podeAplicarDesconto() {
		return podeAplicarDesconto;
	}
	
	public double getPorcentagemDeDesconto() {
		return porcentagemDeDesconto;
	}
	
}
