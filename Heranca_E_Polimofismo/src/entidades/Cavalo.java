package entidades;

public class Cavalo extends Animal 
{
	private String corre;

	public Cavalo(String corre) {
		super();
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String nome, int idade, String emitiSom) {
		super(nome, idade, emitiSom);
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	// METODO
	
	public String getEmitiSom() 
	{
		return "IIIIINNNN RIRIIRI ";
	}
}
