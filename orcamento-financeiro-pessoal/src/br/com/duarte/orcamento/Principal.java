package br.com.duarte.orcamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Inst�ncia de categoria
		Categoria ct1 = new Categoria("Sal�rio");
		Categoria ct2 = new Categoria("Alimenta��o");
		Categoria ct3 = new Categoria("Transporte");
		
		// Inst�ncia - Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2045, 678905435, "Caixa", 400, 200, 65.40);
		ContaCorrente cc2 = new ContaCorrente(2111, 678222345, "Bradesco", 100, 200, 65.40);
		
		// Inst�ncia - Conta Poupan�a
		ContaPoupanca cp1 = new ContaPoupanca(6786, 356904535, "Santander", 1000, 0.02);
		ContaPoupanca cp2 = new ContaPoupanca(7890, 345667835, "Ita�", 1000, 0.02);
		
		// Inst�ncia - Movimenta��o
		Movimentacao m1 = new Movimentacao(ct1, "Sacar", cc1, 50, "12/02/2021");
		Movimentacao m2 = new Movimentacao(ct2, "Deposito", cp1, 100, "01/02/2021");

		int opcao;
		
		do {
			
			System.out.println("\n\tSOFP - Sistema de Or�amento Finaceiro Pessoal ");
			System.out.println("\n                  =========================");
			System.out.println("                  |   1 - Conta Corrente  |");
			System.out.println("                  |   2 - Conta Poupan�a  |");
			System.out.println("                  |   3 - Movimenta��o    |");
			System.out.println("                  |   0 - Sair            |");
			System.out.println("                  =========================\n");

			System.out.print("\n");
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o c�digo: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(cc1.toString());
				System.out.println(cc2.toString());
				
				// M�todos conta corrente
				cc1.consultarLimite();
				cc1.calcSaldoMaisLimite();
				
				cc2.consultarLimite();
				cc2.calcSaldoMaisLimite();
				
				break;
			case 2:
				System.out.println(cp1.toString());
				System.out.println(cp2.toString());
				
				// M�todo conta poupan�a
				cp1.rendimentoConta();
				cp2.rendimentoConta();

				break;
			case 3:
				System.out.println(m1.toString());
				System.out.println(m2.toString());
				
				// Movimenta��o - Sacar
				m1.calcSacar();
				
				// Movimenta��o - Deposito
				m2.calcDeposito();
				
				break;
			case 0:
				System.out.println("\nAt� mais!");
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
		
	}
 
}
