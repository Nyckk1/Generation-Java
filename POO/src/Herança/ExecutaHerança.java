package Herança;

public class ExecutaHerança {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguiça p1 = new Preguiça();

		c1.setNome("Snow");
		c1.setIdade(1);
		c1.setRaca("Shih Tzu");
		
		c2.setNome("Pegasus");
		c2.setIdade(3);
		c2.setRaca("Puro-Sangue inglês");
		
		p1.setNome("Sid");
		p1.setIdade(12);
		p1.setRaca("Preguiça-Real");
		
		System.out.println("Nome: " + c1.getNome() +"\nRaça: " + c1.getRaca() + "\nIdade: " + c1.getIdade() + "\nComo o Snow esta? ");
		c1.sono();
		System.out.println("\nNome: " + c2.getNome() +"\nRaça: " + c2.getRaca() + "\nIdade: " + c2.getIdade() + "\nOnde o Pegasus foi parar?");
		c2.alimento();
		System.out.println("\nNome: " + p1.getNome() +"\nRaça: " + p1.getRaca() + "\nIdade: " + p1.getIdade() + "\nAonde o Sid se encontra? ");
		p1.arvore();
	}

}
