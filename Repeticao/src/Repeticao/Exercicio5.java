package Repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int numeros, soma =0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Informe um numero: ");
			numeros = leia.nextInt();
			soma += numeros;
			
		}while (numeros != 0);
		System.out.println("A soma dos numeros digitados é: " + soma);
		
	}
}
