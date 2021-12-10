package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int x, num, p = 0;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		
		for(x = 1; x <= 10; x++) {
			System.out.println("Informe o numero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				p++;	
			}
		}
		System.out.println("De 10 numeros, " + p + " são pares e " + (10-p)+" são impares");
	}
}
