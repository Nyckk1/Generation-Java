package Exercicios_Introducao;
import java.lang.Math;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		
		float F, D, x1, x2, y1, y2;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o valor de x1: ");
		x1 = ler.nextFloat();
		
		System.out.println("Informe o valor de x2: ");
		x2 = ler.nextFloat();
		
		System.out.println("Informe o valor de y1: ");
		y1 = ler.nextFloat();
		
		System.out.println("Informe o valor de y2: ");
		y2 = ler.nextFloat();
		
		F = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		
		D = (float) Math.sqrt(F);
		
		System.out.println("A distancia entre os pontos é: " + D);
	}
}
