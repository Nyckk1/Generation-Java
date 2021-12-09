package LacoDeDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		double numero[] = new double[3];
		
		for(int i = 0; i<3; i++){
			
			System.out.println("Insira o numero: " + (i+1));
			numero[i] = leia.nextDouble();
			
		}
		Arrays.sort(numero);
		
		leia.close();
		System.out.println("Os numeros ordenados de forma crescente são: " + Arrays.toString(numero));
	}

}