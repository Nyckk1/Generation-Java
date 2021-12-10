package Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int idade = 0, x = -99, menor = 0, maior = 0;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		while(idade != x) {
			System.out.println("Informe a sua idade, para finalizar digite -99: ");
			idade = leia.nextInt();
			
			if(idade >0 && idade <=21) {
				menor++;
			}
			else if (idade >=50) {
				maior++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos foi: " + menor);
		System.out.println("O total de pessoas com mais de 50 anos foi: " + maior);
	}
}
