package entidades;

import entidades.Funcionario;

public class FuncionarioTerceiro extends Funcionario {

	private double horasAdicionais;
	
	
	public FuncionarioTerceiro(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) 
	{
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	// over
	
	public double Pagamento() 
	{
		return super.pagamento() + (this.horasAdicionais * this.getValorPorHora());
	}
	
}