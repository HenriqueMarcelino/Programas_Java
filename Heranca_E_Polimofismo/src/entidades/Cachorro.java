package entidades;

public class Cachorro extends Animal
{
	private String corre;

	public Cachorro(String corre) {
		super();
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, int idade, String emitiSom) {
		super(nome, idade, emitiSom);
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	//metodo
	
	public String getEmitiSom() 
	{
		return "AU AU AU ";
	}
	
	
}
