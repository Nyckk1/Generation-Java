package Herança;

public class Cavalo extends Animal {
	
	private String galopa;
	
	public String getGalopa() {
		return galopa;
	}

	public void setGalopa(String galopa) {
		this.galopa = galopa;
	}

	public void alimento() {
		System.out.println("Pegasus está Pastando");
	}
	
}
