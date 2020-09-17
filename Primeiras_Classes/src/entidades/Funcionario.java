package entidades;

public class Funcionario {
	
	public String nome;
	public int matricula;
	public double cpf;
	public String departamento;

	
	public void mostrarInfo() {

	System.out.printf("\nOlá funcionário !!");
	System.out.printf("\nNome do funcionário: %s",nome);
	System.out.printf("\nMatrícula: %d",matricula);
	System.out.printf("\nCPF: %f",cpf);
	System.out.printf("\nDepartamento: %s", departamento);

	}
}