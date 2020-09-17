package Entidades;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase ;
	private double imposto;
	private String vencimentoBase;
	
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String getVencimentoBase() {
		return vencimentoBase;
	}

	public void setVencimentoBase(String vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}

	public double calculoDeSalario()
	{
		double imp = imposto /100;
		
		salarioBase = (salarioBase-(salarioBase*imp));
		
		
		return salarioBase;
		

		//		return this.salarioBase - ( this.imposto%100);
		
	}
	
		
		

}
