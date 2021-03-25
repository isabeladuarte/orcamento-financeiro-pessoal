package br.com.duarte.orcamento;

import java.math.BigDecimal;

public class Movimentacao {
	private Categoria categoria;
	private String descricao;
	private TipoMovimentacao tipo;
	private BigDecimal valorTransacao;
	private Conta conta;
	private String data;
	
	public Movimentacao(Categoria categoria, String descricao, Conta conta,
			BigDecimal valorTransacao, String data) {
		this.categoria = categoria;
		this.descricao = descricao;
		this.valorTransacao = valorTransacao;
		if(valorTransacao.compareTo(BigDecimal.ZERO) > 0) {
			this.tipo = TipoMovimentacao.RECEITA;
		} else {
			this.tipo = TipoMovimentacao.DESPESA;
		}
		this.conta = conta;
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public TipoMovimentacao getTipo() {
		return this.tipo;
	}

	public BigDecimal getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(BigDecimal valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	
	public void calcSacar(){
		if(valorTransacao.compareTo(BigDecimal.ZERO) > 0) {
		BigDecimal calc = this.getConta().getSaldo().subtract(valorTransacao);
		System.out.println("\nMovimentação - Saque - Conta " + getConta().getNumConta());
		System.out.println("Valor de saque: R$ " + this.getValorTransacao());
		System.out.println("Saldo atual da conta R$ " + calc);
		} else {
			System.out.println("Valor inválido!");
		}
	}
	
	public void calcDeposito() {
		if(valorTransacao.compareTo(BigDecimal.ZERO) > 0) {
			BigDecimal calc = this.getConta().getSaldo().add(valorTransacao);
		System.out.println("\nMovimentação - Depósito - Conta " + getConta().getNumConta());
		System.out.println("Valor de deposito: R$ " + this.getValorTransacao());
		System.out.println("Saldo atual da conta R$ " + calc);
		} else {
			System.out.println("Valor inválido!");
		}
	}

	@Override
	public String toString() {
		return "\nMovimentacao [categoria=" + categoria + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", valorTransacao=" + valorTransacao + ", conta=" + conta + ", data=" + data + "]";
	}
}
