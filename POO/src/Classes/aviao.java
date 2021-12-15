package Classes;

public class aviao {
	
	String companhia;
	int passagem;
	int assento;
	int totalPassageiros;
	int numeroVoo;
	
	public void status() {
		System.out.println("O nome da Companhia aerea é: " + this.companhia);
		//System.out.println("O numero da sua passagem é: "+ this.passagem);
		System.out.println("Você comprou o assento de numero: "+ this.assento);
		System.out.println("O total de passageiros é:"+ this.totalPassageiros);
		System.out.println("O numero do seu Voo é: "+ this.numeroVoo);
		//System.out.println("O horario do seu Voo é: "+ this.);
	}
}
