package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.println("Informe a idade do(a) Participante: ");
		idade = leia.nextInt();
		
		if (idade >=10 && idade <= 14) {
			System.out.println("Participante alocado na categoria Infantil!!");
		}
		else if (idade >=15 && idade <= 17) {
			System.out.println("Participante alocado na categoria Juvenil!!");
		}
		else if (idade >=18 && idade <= 25) {
			System.out.println("Participante alocado na categoria Adulto!!");
		}
		else
			System.out.println("Idade do participante não se encaixa nas categorias listadas!!");
		leia.close();
	}
}