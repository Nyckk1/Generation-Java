package Classes;

public class aviao {
	
	String companhia;
	int passagem;
	int assento;
	int totalPassageiros;
	int numeroVoo;
	
	public void status() {
		System.out.println("O nome da Companhia aerea �: " + this.companhia);
		//System.out.println("O numero da sua passagem �: "+ this.passagem);
		System.out.println("Voc� comprou o assento de numero: "+ this.assento);
		System.out.println("O total de passageiros �:"+ this.totalPassageiros);
		System.out.println("O numero do seu Voo �: "+ this.numeroVoo);
		//System.out.println("O horario do seu Voo �: "+ this.);
	}
}
