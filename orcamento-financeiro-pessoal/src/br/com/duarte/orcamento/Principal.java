package br.com.duarte.orcamento;

public class Principal {

	public static void main(String[] args) {
		// Instância de categoria
		Categoria ct1 = new Categoria("Salário");
		Categoria ct2 = new Categoria("Alimentação");
		Categoria ct3 = new Categoria("Transporte");
		
		// Instância - conta
		ContaCorrente cc1 = new ContaCorrente(2045, 678905435, "Caixa", 400, 200, 65.40);
		ContaCorrente cc2 = new ContaCorrente(2111, 678222345, "Bradesco", 100, 200, 65.40);
		System.out.println(cc1.toString());
		
		// Instância - Movimentação
		Movimentacao m1 = new Movimentacao(ct1, "Sacar", cc1, 50, "12/02/2021");
		Movimentacao m2 = new Movimentacao(ct2, "Deposito", cc1, 100, "01/02/2021");
		System.out.println(m1.toString());
		
		// Movimentação - Sacar
		m1.calcSacar();
		
		// Movimentação - Deposito
		m2.calcDeposito();
		
		// Métodos conta corrente
		cc1.consultarLimite();
		cc1.calcSaldoMaisLimite();
		
		
	}
 
}
