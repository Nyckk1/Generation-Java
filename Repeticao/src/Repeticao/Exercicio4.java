package Repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int menorC = 0, maiorN = 0, outros = 0, caracteristica, calmas = 0, nervosas = 0, agressivos = 0, idade, pessoa = 1;
		
		
		
		while(pessoa <=150) {
			System.out.println("Informe a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe o seu sexo: \n(1) Feminino \n(2) Masculino \n(3) Outros");
			int num = leia.nextInt();
			
			System.out.println("Por Favor, informe uma caracteristica: \n(1) Calma \n(2) Nervosa \n(3) agressiva");
			caracteristica = leia.nextInt();
			pessoa++;
			
			if(caracteristica == (1)) 
				calmas++;
			if(num == (1) && caracteristica == (2))
				nervosas++;
			if(num == (2) && caracteristica == (3))
				agressivos++;
			if(num == (3) && caracteristica == (1))
				outros++;
			if(caracteristica == (2) && idade >40)
				maiorN++;
			if(caracteristica == (1) && idade <18)
				menorC++;
		}
		System.out.println("O número de Pessoas Calmas foi: " + calmas);
		System.out.println("O número de Mulheres Nervosas foi: " + nervosas);
		System.out.println("O número de Homens Agressivos foi: " + agressivos);
		System.out.println("O número de Outros Calmos foi: " + outros);
		System.out.println("O número de Pessoas Nervosas com mais de 40 anos foi: " + maiorN);
		System.out.println("O número de Pessoas Calmas com menos de 18 anos foi: " + menorC);
		
	}
}
