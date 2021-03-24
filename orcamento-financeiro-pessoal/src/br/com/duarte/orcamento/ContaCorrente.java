package br.com.duarte.orcamento;

public class ContaCorrente extends Conta{
	private double limite;
	private double cestaServico;
	
	public ContaCorrente(Integer agencia, Integer numConta, String nomeBanco, 
			double saldo, double limite, double cestaServico) {
		super.setSaldo(saldo);
		super.setAgencia(agencia);
		super.setNumConta(numConta);
		super.setNomeBanco(nomeBanco);
		this.limite = limite;
		this.cestaServico = cestaServico;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getCestaServico() {
		return cestaServico;
	}

	public void setCestaServico(double cestaServico) {
		this.cestaServico = cestaServico;
	}
	
	public void consultarLimite() {
		System.out.println("\nLimite - Conta Corrente - " + getNumConta());
		System.out.println("Limite: R$ " + this.limite);
	}
	
	public void calcSaldoMaisLimite() {
		double calc = this.getSaldo() + this.limite; 
		System.out.println("\nSaldo + Limite - Conta Corrente -  " + getNumConta());
		System.out.println("Saldo + Limite da Conta: R$ " + calc);
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + getAgencia() + ", numConta=" + getNumConta() + ", nomeBanco=" + getNomeBanco() + ", saldo=" + getSaldo() + ", limite=" + limite + ", cestaServico=" + cestaServico + "]";
	}
	
}
