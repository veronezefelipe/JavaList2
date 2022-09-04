package atividade02;

import java.util.Scanner;

public class ControleBancario {

	public static void main(String[] args) {
		
		//quantidade de contas especificada no enunciado
		int qtdContas = 3;
		int[] codigos = new int[qtdContas];
		double[] saldos = new double[qtdContas];
		
		Scanner sc = new Scanner(System.in);
		boolean existe;
		//leitura dos dados
		for(int i = 0; i < codigos.length; i++) {
			existe = false;
			
			System.out.print("Forne�a o n�mero da conta: ");
			codigos[i] = sc.nextInt();
			//fun��o de valida��o de c�digo
			
			for (int j = 0; j < i; j++) {			
				if (codigos[i] == codigos[j]) {
					System.out.println("Conta existente!");
					existe = true;
					
					i--;
					break;
				}
			}
			
			if (!existe) {
				System.out.println("Forne�a o saldo da conta:");
				saldos[i] = sc.nextDouble();
			}
		}
		
		int opcao = 0;
		do {
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Ativo Banc�rio");
			System.out.println("4 - Sair");
			System.out.print("Digite a sua op��o: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1: {
					//dep�sito
					System.out.print("Digite o n�mero da sua conta: ");
					int cod = sc.nextInt();
															
					int indiceConta = -1;
					for (int i = 0; i < saldos.length; i++) {
						if (cod == codigos[i]) {
							indiceConta = i;
							break;
						}
					}
					
					if (indiceConta >= 0) {
						System.out.print("Digite o valor a ser depositado: ");
						double valor = sc.nextDouble();
						saldos[indiceConta] += valor;
					}else
						System.out.println("Conta inexistente.");
					
					break;
				}
				case 2: {
					//saque
					System.out.print("Digite o n�mero da sua conta: ");
					int cod = sc.nextInt();							
					
					int indiceConta = -1;
					for (int i = 0; i < saldos.length; i++) {
						if (cod == codigos[i]) {
							indiceConta = i;
							break;
						}
					}
					if (indiceConta >= 0) {
						System.out.print("Digite o valor a ser sacado: ");
						double valor = sc.nextDouble();					
						saldos[indiceConta] -= valor;
					}else
						System.out.println("Conta inexistente.");
					
					break;
				}
				case 3: {
					//ativo banc�rios
					double ativoBancario = 0;
					for (int i = 0; i < saldos.length; i++) {
						
						
						
						if (saldos[i] > 0)
							ativoBancario += saldos[i];											
					}
					System.out.println("Ativo banc�rio: R$ " + ativoBancario);
					
					break;
				}
				case 4: {
					System.out.println("Xau! ");
					break;
				}
				default:{
					System.out.println("Op��o inv�lida!");
				}
				
			}
								
		}while(opcao != 4);
		
		for(int i = 0; i < codigos.length; i++) {
		
		System.out.println("C�digo " + codigos[i] + " === Saldo R$ " + saldos[i]);
	}
		
	}
}