package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int numero, quadrado;
		double raiz; 
		
		System.out.println("Informe um numero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			
			raiz = (double) Math.sqrt(numero);
			
			System.out.println("O numero informado foi "+ numero +" e ele � par!");
			System.out.println("A raiz quadrada desse numero �: " + raiz);
		}
		
		else {
			
			quadrado = (int) Math.pow(numero, 2);
			System.out.println("O numero informado foi: " + numero + " e ele � impar");
			System.out.println("O numero " +numero+ " elevado ao quadrado �: " + quadrado);
		}
		leia.close();
	}
}