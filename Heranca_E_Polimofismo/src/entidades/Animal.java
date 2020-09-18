package entidades;

public class Animal 
{
	private String nome;
	private int idade;
	private String emitiSom;
	
	
	public Animal() 
	{
		
	}
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Animal(String nome, int idade, String emitiSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitiSom = emitiSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitiSom() {
		return emitiSom;
	}
	
	//METODO
	
	public void setEmitiSom(final String emitiSom) 
	{
		this.emitiSom = emitiSom;
	}
	
}

