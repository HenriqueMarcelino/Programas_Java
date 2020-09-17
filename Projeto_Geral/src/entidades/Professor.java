package entidades;

public class Professor extends Pessoa 
{
	private String MateriaLecionada;
	
	public Professor(String nome, String materiaLecionada) {
		super(nome);
		MateriaLecionada = materiaLecionada;
	}
	
}
	
