package aplicacao;
import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {
	public static void main(String[]args) 
	{
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa alguem = new Pessoa("Henrique");
		Pessoa alguem1 = new Pessoa("Gabrila", 'f');
		Aluno novoAluno = new Aluno("Carlos",'M',2017);
		
		Professor novoProfessor = new Professor("Ednilson","JAVA");
		
		System.out.println(novoAluno.getNome());
		System.out.println(alguem1.getNome());
		System.out.println(novoProfessor.getNome());
		
		
	}
}