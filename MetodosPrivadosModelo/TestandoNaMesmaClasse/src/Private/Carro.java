package Private;

public class Carro {
	
	// criar a variavel
	private String nome;
	
	
	//metodo que impime a vari�vel
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma " + nome + " � de 380km");
	}
	
public static void main(String[] args) {
		
		//instacia o objeto
		Carro c = new Carro();
		c.nome = "Ferrari";
		c.exibeVelocidade();
	}

	

}
