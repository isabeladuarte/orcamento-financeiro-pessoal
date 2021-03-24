package br.com.duarte.orcamento;

public class Movimentacao {
	private Categoria categoria;
	private String descricao;
	private TipoMovimentacao tipo;
	private double valorTransacao;
	private Conta conta;
	private String data;
	
	public Movimentacao(Categoria categoria, String descricao, Conta conta,
			double valorTransacao, String data) {
		this.categoria = categoria;
		this.descricao = descricao;
		this.valorTransacao = valorTransacao;
		if(valorTransacao > 0) {
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

	public double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	
	public void calcSacar(){
		if(valorTransacao > 0) {
		double calc = this.getConta().getSaldo() - valorTransacao;
		System.out.println("\nMovimenta��o - Saque - Conta " + getConta().getNumConta());
		System.out.println("Valor de saque: R$ " + this.getValorTransacao());
		System.out.println("Saldo atual da conta R$ " + calc);
		} else {
			System.out.println("Valor inv�lido!");
		}
	}
	
	public void calcDeposito() {
		if(valorTransacao > 0) {
		double calc = valorTransacao + this.getConta().getSaldo();
		System.out.println("\nMovimenta��o - Dep�sito - Conta " + + getConta().getNumConta());
		System.out.println("Valor de deposito: R$ " + this.getValorTransacao());
		System.out.println("Saldo atual da conta R$ " + calc);
		} else {
			System.out.println("Valor inv�lido!");
		}
	}

	@Override
	public String toString() {
		return "\nMovimentacao [categoria=" + categoria + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", valorTransacao=" + valorTransacao + ", conta=" + conta + ", data=" + data + "]";
	}
}
