package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3, media;
		int p1 = 2, p2 = 3, p3 = 5;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe a Primeira nota: ");
		n1 = ler.nextInt();
		
		System.out.println("Informe a Segunda nota: ");
		n2 = ler.nextInt();
		
		System.out.println("Informe a Terceira nota: ");
		n3 = ler.nextInt();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A media do aluno foi: " + media);
	}

}
