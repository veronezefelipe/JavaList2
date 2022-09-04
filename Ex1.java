package List2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int[] vet1 = {1,2,3,4,5,6,7,8,9,10};
		int[] vet2 = {1,2,3,4,5,6,7,8,9,10};
		int[] vet = new int[20];
		int i;
		int j = vet2.length;
		for(i=0;i<vet2.length;i++) {
			vet[i] = vet2[i];
		}
		for(i=0;i<vet1.length;i++) {
			vet[i+j] = vet1[i];
		}
		int temp=0;
		int n = vr.length;
		for(i=0;i<n;i++) {
			for(int k=1k<(n-i);k++) {
				if(vet[k-1]<vet[k]) {
					temp = vet[k-1];
					vet[k-1] = vet[k];
					vet[k] = temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(vet[i]);
		}
	}
}
