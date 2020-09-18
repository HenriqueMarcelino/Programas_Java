package entidades;

public class Preguica extends Animal
{
	private String sobeEmArvores;

	public String getSobeEmArvores() {
		return sobeEmArvores;
	}

	public void setSobeEmArvores(String sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}

	public Preguica(String sobeEmArvores) {
		super();
		this.sobeEmArvores = sobeEmArvores;
	}

	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguica(String nome, int idade, String emitiSom) {
		super(nome, idade, emitiSom);
		// TODO Auto-generated constructor stub
	}

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public String getEmitiSom() 
	{
		return "FIIIIIIIIIIIIIII";
	}
}
