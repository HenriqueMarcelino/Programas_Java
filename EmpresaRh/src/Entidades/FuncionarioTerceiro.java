package Entidades;

public class FuncionarioTerceiro extends Funcionario {

	private double horasAdicionais;
	
	public FuncionarioTerceiro(String nome, double horasAdicionais) {
		
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	
}