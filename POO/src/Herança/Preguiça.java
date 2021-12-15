package Herança;

public class Preguiça extends Animal {
	
	private String dormindo;
	
	public void arvore() {
		System.out.println("Subindo em uma arvore");
	}

	public String getDormindo() {
		return dormindo;
	}

	public void setDormindo(String dormindo) {
		this.dormindo = dormindo;
	}

}
