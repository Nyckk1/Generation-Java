package Classes;

import java.util.Scanner;

public class ClasseExecucao1 {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu Nome: ");
		cl.nome = sc.next();
		
		System.out.print("Informe o seu endere�o: ");
		cl.endereco = sc.next();
		
		System.out.print("Informe sua Idade: ");
		cl.idade = sc.nextInt();
		
		System.out.print("Informe seu Sexo: ");
		cl.sexo = sc.next();
		 System.out.println("\nInforma��es Digitadas");
		
		cl.status();
	}

}
