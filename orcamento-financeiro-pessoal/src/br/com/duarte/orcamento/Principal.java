package br.com.duarte.orcamento;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instância de categoria
		Categoria ct1 = new Categoria("Salário");
		Categoria ct2 = new Categoria("Alimentação");
		Categoria ct3 = new Categoria("Transporte");
		
		// Conta Corrente - BigDecimal 
		BigDecimal cs1 = new BigDecimal("500");
		BigDecimal cl1 = new BigDecimal("100");
		BigDecimal cs2 = new BigDecimal("200");
		BigDecimal cl2 = new BigDecimal("10");
		
		// Instância - Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2045, 678905435, "Caixa", cs1, cl1, 65.40);
		ContaCorrente cc2 = new ContaCorrente(2111, 678222345, "Bradesco", cs1, cl2, 65.40);
		
		// Conta Poupança - BigDecimal
		BigDecimal cps1 = new BigDecimal("500");
		BigDecimal cpt1 = new BigDecimal("0.02");
		BigDecimal cps2 = new BigDecimal("200");
		BigDecimal cpt2 = new BigDecimal("0.02");
		
		// Instância - Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(6786, 356904535, "Santander", cps1, cpt1);
		ContaPoupanca cp2 = new ContaPoupanca(7890, 345667835, "Itaú", cps2, cpt2);
		
		// Movimentação - BigDecimal
		BigDecimal mv1 = new BigDecimal("200");
		BigDecimal mv2 = new BigDecimal("100");
		
		// Instância - Movimentação
		Movimentacao m1 = new Movimentacao(ct1, "Sacar", cc1, mv1, "12/02/2021");
		Movimentacao m2 = new Movimentacao(ct2, "Deposito", cp1, mv2, "01/02/2021");
		
		int opcao;
		do {
			
			System.out.println("\n\tSOFP - Sistema de Orçamento Finaceiro Pessoal ");
			System.out.println("\n                  =========================");
			System.out.println("                  |   1 - Conta Corrente  |");
			System.out.println("                  |   2 - Conta Poupança  |");
			System.out.println("                  |   3 - Movimentação    |");
			System.out.println("                  |   0 - Sair            |");
			System.out.println("                  =========================\n");

			System.out.print("\n");
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o código: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(cc1.toString());
				System.out.println(cc2.toString());
				
				// Métodos conta corrente
				cc1.consultarLimite();
				cc1.calcSaldoMaisLimite();
				
				cc2.consultarLimite();
				cc2.calcSaldoMaisLimite();
				
				break;
			case 2:
				System.out.println(cp1.toString());
				System.out.println(cp2.toString());
				
				// Método conta poupança
				cp1.rendimentoConta();
				cp2.rendimentoConta();

				break;
			case 3:
				System.out.println(m1.toString());
				System.out.println(m2.toString());
				
				// Movimentação - Sacar
				m1.calcSacar();
				
				// Movimentação - Deposito
				m2.calcDeposito();
				
				break;
			case 0:
				System.out.println("\nAté mais!");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		
	}
 
}
