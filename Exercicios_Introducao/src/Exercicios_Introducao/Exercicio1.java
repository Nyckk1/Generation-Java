package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias_no_ano = 365, dias_no_mes = 30;
		int dias, meses, anos;

		@SuppressWarnings("resource")
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a sua idade: ");

		System.out.println("Anos: ");
		anos = ler.nextInt();

		System.out.println("Informe o Mes: ");
		meses = ler.nextInt();

		System.out.println("Informe os Dias: ");
		dias = ler.nextInt();

		dias += (anos * dias_no_ano) + (meses * dias_no_mes);

		System.out.println("Sua idade em dias é: " + dias);
	}

}
