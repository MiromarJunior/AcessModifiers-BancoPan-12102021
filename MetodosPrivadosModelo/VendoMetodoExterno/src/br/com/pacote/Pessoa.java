package br.com.pacote;

public class Pessoa {
	
	private String name =  "Miromar Junior ";
	
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem � ?? .." + visitanteNome);
		return name;
	}
	

}
