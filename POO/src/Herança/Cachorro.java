package Heran�a;

public class Cachorro extends Animal {

	private String brinquedo;
	
	public void sono(){
		System.out.println("Est� dormindo tranquilamente");
	}

	public String getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}
	
	
}
