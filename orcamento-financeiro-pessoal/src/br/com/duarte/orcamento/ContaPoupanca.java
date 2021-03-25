package br.com.duarte.orcamento;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{
	private BigDecimal taxa;
	
	public ContaPoupanca(Integer agencia, Integer numConta, String nomeBanco, 
			BigDecimal saldo, BigDecimal taxa) {
		super.setSaldo(saldo);
		super.setAgencia(agencia);
		super.setNumConta(numConta);
		super.setNomeBanco(nomeBanco);
		this.taxa = taxa;
	}
	
	public ContaPoupanca(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(double juros) {
		this.taxa = taxa;
	}
	
	public void rendimentoConta() {
		BigDecimal calc = this.getSaldo().multiply(taxa);
		System.out.println("\nRendimento - Conta Poupança - " + getNumConta());
		System.out.println("Rendimento: R$ " + calc);
	}
	
	
	@Override
	public String toString() {
		return "\nContaPoupanca "+ "[agencia=" + getAgencia() + ", numConta=" + getNumConta() + ", nomeBanco=" + getNomeBanco() + ", saldo=" + getSaldo() + ", taxa=" + taxa + "]";
	}
	
}
