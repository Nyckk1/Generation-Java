package Repeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int numero, media = 0, soma = 0, cont = 0;
		
		do {
			System.out.println("Informe um numero ou digite 0 para sair: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				cont++;
				media = soma/cont;	
			}	
			
		}while(numero !=0);
		System.out.println("A media dos numeros é: " + media);
	}
	
}
