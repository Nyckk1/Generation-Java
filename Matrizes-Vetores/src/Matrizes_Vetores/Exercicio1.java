package Matrizes_Vetores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		int[] vetor = new int [5];
		int maior = 0, x;
		
		for (x=0;x<5;x++) {
			System.out.print("Entre com a pontuação das atividades: ");
			vetor[x] = sc.nextInt();
						
		}
		for (x=0;x<5;x++) 
			System.out.print(vetor[x]+"\t");
		
		for (x=0;x<5;x++) {
			if (vetor[x] > maior) 
				maior = vetor[x];
		}
		System.out.println("\nA maior pontuação das atividades é: "+ maior);
	}
}
