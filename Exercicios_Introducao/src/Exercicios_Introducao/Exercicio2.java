package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args []) {
		
		int ano, mes, dia, dias;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a idade em dias: ");
		dias = ler.nextInt();
		
		ano = (dias/365);
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("Sua idade em Anos, Meses e Dias é: " + ano + " Anos, " + mes + " Meses e " + dia + " Dias");
		
	}
}
