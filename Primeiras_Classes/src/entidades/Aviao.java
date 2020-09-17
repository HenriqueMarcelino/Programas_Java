package entidades;

public class Aviao {
	
	public String compania;
	public int numeroAviao;

	
	public void mostraAviao() {
		
		System.out.printf("\nA compania é :%s ",compania);
		System.out.printf("\nO numero do avião: %s ",numeroAviao);
		System.out.println("\nEssa aeronave não faz viagens internacionais...");
	}
}
