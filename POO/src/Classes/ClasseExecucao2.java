package Classes;

import java.util.Scanner;

public class ClasseExecucao2 {

	public static void main(String[] args) {
		
		aviao av = new aviao();
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a companhia que você ira usar: ");
		av.companhia = sc.next();
		
		/*System.out.print("Informe o numero da passagem que foi adquirido: ");
		av.passagem = sc.nextInt();*/
		
		System.out.print("Informe o numero do seu assento: ");
		av.assento = sc.nextInt();
		
		System.out.print("Informe o total de passageiros no avião: ");
		av.totalPassageiros = sc.nextInt();
		
		System.out.print("Informe o numero do seu Voo: ");
		av.numeroVoo = sc.nextInt();
		
		av.status();
		
	}

}
