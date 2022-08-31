package List2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vet1 = new int[10];
		int [] vet2 = new int[10];
		int [] vetNotC = new int[20];
		boolean comum = false;
		int k = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor 1: Informe um num inteiro:");
			vet1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor 2: Informe um num inteiro:");
			vet2[i] = sc.nextInt();
		}
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				if(vet1[0+j] == vet2[i]) {
					comum = true;
				}
			}
			if(comum == false) {
				vetNotC[0+k] = vet1[0+j];
				k++;
			}
			comum = false;
		}
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				if(vet2[0+j] == vet1[i]) {
					comum = true;
				}
			}
			if(comum == false) {
				vetNotC[0+k] = vet2[0+j];
				k++;
			}
			comum = false;
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println(vetNotC[i]);
			
		}
	}
}
