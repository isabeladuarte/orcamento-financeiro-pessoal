package br.com.duarte.orcamento;

import java.math.BigDecimal;

public abstract class Conta {
	private Integer agencia;
	private Integer numConta;
	private String nomeBanco;
	private BigDecimal saldo;
	
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

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numConta=" + numConta + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo
				+ "]";
	}
	
}
 