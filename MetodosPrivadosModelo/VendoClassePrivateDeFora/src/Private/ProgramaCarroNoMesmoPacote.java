package Private;

public class ProgramaCarroNoMesmoPacote {
	
public static void main(String[] args) {
		
		//instacia o objeto
		Carro c = new Carro();
		c.setNome("Ferrari");
		
		
		System.out.println(c.getNome());              
		
		c.exibeVelocidade();
	}

}
