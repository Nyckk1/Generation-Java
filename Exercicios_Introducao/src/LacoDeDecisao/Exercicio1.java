package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int [] numeros = new int[4];
		int cont = 0;
		
		Scanner nmr = new Scanner(System.in);
		
		for(int i = 1; i < numeros.length; i++){ 
			System.out.println("Informe o numero " + i + ": ");
			numeros[i] = nmr.nextInt();
			
			if(numeros[i] > cont) {
				cont = numeros[i];
			}
		}
		nmr.close();
		System.out.println("O mair numero digitado foi: " + cont);
	}

}