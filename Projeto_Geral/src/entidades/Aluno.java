package entidades;

public class Aluno extends Pessoa
{
	
	private String turma;
	private double notas[] = new double [2];
	
	public Aluno(String nome, char sexo, int anoNasc) {
		super(nome, sexo, anoNasc);
		this.turma = turma;
		this.notas = notas;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
