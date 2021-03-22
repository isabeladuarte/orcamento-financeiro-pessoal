package br.com.duarte.orcamento;

public class ContaPoupanca extends Conta{
	private double juros;
	
	public ContaPoupanca(Integer agencia, Integer numConta, String nomeBanco, 
			double saldo, double juros) {
		super.setSaldo(saldo);
		this.juros = juros;
	}
	
	public ContaPoupanca(double juros) {
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [juros=" + juros + "]";
	}
	
}
