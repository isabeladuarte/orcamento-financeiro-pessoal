package br.com.duarte.orcamento;

public class Principal {

	public static void main(String[] args) {
		// Inst�ncia de categoria
		Categoria ct1 = new Categoria("Sal�rio");
		Categoria ct2 = new Categoria("Alimenta��o");
		Categoria ct3 = new Categoria("Transporte");
		
		// Inst�ncia - conta
		ContaCorrente cc1 = new ContaCorrente(2045, 678905435, "Caixa", 400, 200, 65.40);
		ContaCorrente cc2 = new ContaCorrente(2111, 678222345, "Bradesco", 100, 200, 65.40);
		System.out.println(cc1.toString());
		
		// Inst�ncia - Movimenta��o
		Movimentacao m1 = new Movimentacao(ct1, "Sacar", cc1, 50, "12/02/2021");
		Movimentacao m2 = new Movimentacao(ct2, "Deposito", cc1, 100, "01/02/2021");
		System.out.println(m1.toString());
		
		// Movimenta��o - Sacar
		m1.calcSacar();
		
		// Movimenta��o - Deposito
		m2.calcDeposito();
		
		// M�todos conta corrente
		cc1.consultarLimite();
		cc1.calcSaldoMaisLimite();
		
		
	}
 
}
