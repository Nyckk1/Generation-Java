package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C, D, R, S;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um numero Inteiro e Positivo para a letra A: ");
		A = ler.nextInt();
		
		System.out.println("Informe um numero Inteiro e Positivo para a letra B: ");
		B = ler.nextInt();
		
		System.out.println("Informe um numero Inteiro e Positivo para a letra C: ");
		C = ler.nextInt();
		
		R = (A+B) * (A+B);
		S = (B+C) * (B+C);

		D = (R + S)/2;
		
		System.out.println("O resultado da expressão é: " + D);
	}

}
