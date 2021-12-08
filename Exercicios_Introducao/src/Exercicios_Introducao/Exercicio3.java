package Exercicios_Introducao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int horas, minutos, segundos, seg;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o Horario em segundos: ");
		seg = ler.nextInt();
		
		horas = (seg / 3600);
		minutos = (seg % 3600) / 60;
		segundos = (seg % 3600) % 60;
		
		System.out.println("O tempo do evento foi: " + horas + " Horas, " + minutos + " Minutos e " + segundos + " Segundos");
	}
}
