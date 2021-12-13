package Matrizes_Vetores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] N1 = new int [4][6]; int[][] N2 = new int [4][6]; 
		int[][] M1 = new int [4][6]; int[][] M2 = new int [4][6];
		int linha, coluna;
		
		//Primeiro *FOR* definindo a matriz N1
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				System.out.print("Digite alguns numeros para a matriz N1: ");
				N1[linha][coluna] = sc.nextInt();
			}
		}
		
		//Segundo *FOR* definindo a matriz N2
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				System.out.print("Digite alguns numeros para a matriz N2: ");
				N2[linha][coluna] = sc.nextInt();
			}
		}
		System.out.print("\nA soma das matrizes N1 e N2 são: \n");
		
		//Terceiro *FOR* Executando a Soma das Matrize
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.print("[" + M1[linha][coluna] + "]");
			}
			System.out.println("\n");	
		}
		
		//Quarto e ultimo FOR Executando as diferenças das Matrizes
		
		System.out.println("A diferença entre as matrize é: \n");
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				System.out.print("[" + M2[linha][coluna] + "]");
			}
			System.out.println("\n");
		}
	}
}
