package aplicacao;

public class Funcionario {
	
	public String nome;
	public int matricula;
	public String departamento;
	
	public void mostrarInfo() {

	System.out.printf("\nOl� funcion�rio !!");
	System.out.printf("\nNome do funcion�rio: %s",nome);
	System.out.printf("\nMatr�cula: %d",matricula);
	System.out.printf("\nDepartamento: %s", departamento);

	}
}