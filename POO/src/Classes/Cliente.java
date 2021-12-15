package Classes;

public class Cliente {

	 String nome;
	 // String sobrenome;
	 String endereco;
	 String sexo;
	 int idade;
	
	/*public Cliente (String primeiro, String segundo) {
		
		nome = primeiro;
		sobrenome = segundo;
	}
	public String getNome() {
		
		String Nome = nome+ " "+ sobrenome;
		return Nome;
	}*/
	
	public void status() {
		System.out.println("Seu nome é: "+ this.nome);
		System.out.println("Seu endereço fica na Rua/Av: "+ this.endereco);
		System.out.println("Seu sexo é: "+ this.sexo);
		System.out.println("Sua idade é: "+ this.idade);
	}
}
