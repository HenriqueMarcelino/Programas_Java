package entidades;

public class Aviao {
	
	public String compania;
	public int numeroAviao;

	
	public void mostraAviao() {
		
		System.out.printf("\nA compania � :%s ",compania);
		System.out.printf("\nO numero do avi�o: %s ",numeroAviao);
		System.out.println("\nEssa aeronave n�o faz viagens internacionais...");
	}
}
