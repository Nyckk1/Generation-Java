package Matrizes_Vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int[] dado = new int [10];
		int maior = 0, media = 0, x;
		
		for (x=0;x<10;x++) {
			System.out.print("Insira um valor de 1 a 6: ");
			dado[x] = sc.nextInt();
			
		}
		for (x=0;x<10;x++)
			System.out.print(dado[x] + "\t");
		
		for (x=0;x<10;x++)
			media += dado[x];
		System.out.println("\nA media é: " + media/10);
		
		for (x=0;x<10;x++) {
			if(dado[x] == 6) {
				maior++;
			}
			else {
				System.out.println("Numero incorreto!! Deve-se digitar um numero de 1 a 6 apenas!!!");
			}
				
		}
		System.out.println("\nA frequencia do maior numero foi: " + maior);
	}
}
