package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		int imposto, distribuidor;
		float custoFabrica, custoConsumidor, valorImposto, valorDistribuidor;
		
		imposto = 45;
		distribuidor = 28;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o Valor da Fabrica: ");
		custoFabrica = leia.nextFloat();
		
		valorDistribuidor = (custoFabrica * distribuidor) / 100;
		valorImposto = (custoFabrica * imposto) / 100;
		
		custoConsumidor = (custoFabrica + valorDistribuidor + valorImposto);
		
		System.out.println("O custo para o consumidor é: " + custoConsumidor);
	}
}
