package Matrizes_Vetores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int [3][3];
		int l, c, soma = 0, diagonal = 0;
		
		for(l=0;l<3;l++) {
			
			for(c=0;c<3;c++) {
				
				System.out.print("Informe os numeros para a matriz 3x3: ");
				mat[l][c] = sc.nextInt();
			}
		}
		System.out.println("\nA soma da matriz é: ");
		
		for(l=0;l<3;l++) {
			
			for(c=0;c<3;c++) {
				
				soma += mat[l][c];
				System.out.print("[" + soma + "]");
			}
			System.out.print("\n");
		}
		System.out.println("\nO valor da soma é: "+soma);
		
		System.out.println("\nA soma da diagonal principal é: ");
		
		for(l=0;l<3;l++) {
			diagonal += mat[l][l];
			//diagonal += mat[0][0]+mat[1][1]+mat[2][2];
		}
		System.out.print(diagonal);
	}
}
