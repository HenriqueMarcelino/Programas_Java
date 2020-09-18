package Entidades;

public class Funcionario {
	
	// atributo
	
	private String nome;
	private double horasTrabalhadas; //no metodo pagamento da erro ao deixar como int
	private double valorPorHora;
	
	// Construtores / Atributos
	
	public Funcionario() 
	{
		
	}
	
	public Funcionario(String nome)
	{
		this.nome = nome;
	}
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) 
	{
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	// Encapsulamento
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public double getHorasTrabalhadas() 
	{
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) 
	{
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorPorHora() 
	{
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) 
	{
		this.valorPorHora = valorPorHora;
	}
	
				// metodo
	
	public double pagamento()
	{
		return horasTrabalhadas * valorPorHora;	
	}
	
}