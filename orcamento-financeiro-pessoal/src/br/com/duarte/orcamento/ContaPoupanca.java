package br.com.duarte.orcamento;

public class ContaPoupanca extends Conta{
	private double taxa;
	
	public ContaPoupanca(Integer agencia, Integer numConta, String nomeBanco, 
			double saldo, double taxa) {
		super.setSaldo(saldo);
		super.setAgencia(agencia);
		super.setNumConta(numConta);
		super.setNomeBanco(nomeBanco);
		this.taxa = taxa;
	}
	
	public ContaPoupanca(double taxa) {
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double juros) {
		this.taxa = taxa;
	}
	
	public void rendimentoConta() {
		double calc = this.getSaldo() * taxa;
		System.out.println("\nRendimento - Conta Poupança - " + getNumConta());
		System.out.println("Rendimento: R$ " + calc);
	}
	
	
	@Override
	public String toString() {
		return "\nContaPoupanca "+ "[agencia=" + getAgencia() + ", numConta=" + getNumConta() + ", nomeBanco=" + getNomeBanco() + ", saldo=" + getSaldo() + ", taxa=" + taxa + "]";
	}
	
}
