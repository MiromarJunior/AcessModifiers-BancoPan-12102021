package Private;


public class Carro {
	
	// criar a variavel
	private String nome;
	
	
	//metodo que impime a vari�vel
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma " + nome + " � de 380km");
	}

// getter and setters 
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return this.nome;
	}        
	

	

}
