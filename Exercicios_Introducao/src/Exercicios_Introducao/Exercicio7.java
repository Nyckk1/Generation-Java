package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		int A,B,C,D,E,F,X,Y;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = leia.nextInt();

		System.out.println("Informe o valor de C: ");
		C = leia.nextInt();

		System.out.println("Informe o valor de D: ");
		D = leia.nextInt();

		System.out.println("Informe o valor de E: ");
		E = leia.nextInt();
		
		System.out.println("Informe o valor de F: ");
		F = leia.nextInt();
		
		System.out.println("Informe o valor de X: ");
		X = leia.nextInt();
		
		System.out.println("Informe o valor de Y: ");
		Y = leia.nextInt();
		

		X = (((C*E)-(B*F)) / (A*E)-(B*D));
		Y = (((A*F)-(C*D)) / (A*E)-(B*D));
		
		System.out.println("O resultado de X é: " + X + "\nO resultado de Y é: " + Y);
	}
}
