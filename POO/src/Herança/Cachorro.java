package Herança;

public class Cachorro extends Animal {

	private String brinquedo;
	
	public void sono(){
		System.out.println("Está dormindo tranquilamente");
	}

	public String getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}
	
	
}
