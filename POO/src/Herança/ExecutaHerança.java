package Heran�a;

public class ExecutaHeran�a {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Pregui�a p1 = new Pregui�a();

		c1.setNome("Snow");
		c1.setIdade(1);
		c1.setRaca("Shih Tzu");
		
		c2.setNome("Pegasus");
		c2.setIdade(3);
		c2.setRaca("Puro-Sangue ingl�s");
		
		p1.setNome("Sid");
		p1.setIdade(12);
		p1.setRaca("Pregui�a-Real");
		
		System.out.println("Nome: " + c1.getNome() +"\nRa�a: " + c1.getRaca() + "\nIdade: " + c1.getIdade() + "\nComo o Snow esta? ");
		c1.sono();
		System.out.println("\nNome: " + c2.getNome() +"\nRa�a: " + c2.getRaca() + "\nIdade: " + c2.getIdade() + "\nOnde o Pegasus foi parar?");
		c2.alimento();
		System.out.println("\nNome: " + p1.getNome() +"\nRa�a: " + p1.getRaca() + "\nIdade: " + p1.getIdade() + "\nAonde o Sid se encontra? ");
		p1.arvore();
	}

}
