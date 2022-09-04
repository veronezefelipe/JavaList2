package List2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vet1 = new int[10];
		int [] vet2 = new int[5];
		int [] vetSoma = new int[10];
		int [] vetMult = new int[10];
		int soma = 0;
		int j = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor 1: Informe um num inteiro:");
			vet1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Vetor 2: Informe um num inteiro:");
			vet2[i] = sc.nextInt();
		}
		
		//soma de todos do segundo vetor
		for(int i = 0; i < 5; i++) {
			soma = soma + vet2[i];
		}
		
		for(int i = 0; i < 10; i++) {
			if(vet1[i] % 2 == 0) {
				vetSoma[j] = vet1[i] + soma;
				j++;
			}
		}
		
		j = 0;
		
		for(int k = 0; k<10; k++) {
			for(int i = 0; i < 5; i++) {
				if(vet1[0+k] % vet2[i] == 0 ) {
					vetMult[j] = vet1[0+k];
					j++;
					break;
				}
			}
		}
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print(vetSoma[i]+", ");
		}
		System.out.println("\n");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetMult[i]+", ");
		}
	}
}
