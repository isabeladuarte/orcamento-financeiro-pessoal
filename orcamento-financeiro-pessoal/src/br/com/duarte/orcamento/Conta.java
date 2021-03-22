package br.com.duarte.orcamento;

public abstract class Conta {
	private Integer agencia;
	private Integer numConta;
	private String nomeBanco;
	private double saldo;
	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numConta=" + numConta + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo
				+ "]";
	}
	
}
 