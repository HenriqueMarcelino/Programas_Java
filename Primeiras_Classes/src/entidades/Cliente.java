package entidades;

public class Cliente {
	
	public String nome;
	public int idade;
	public int sexo;
	public String email;
	public String telefone;
	
	public void mostrarCliente() 
	{
		System.out.printf("Nome do Cliente: %s", nome);
		System.out.printf("\nEmail do cliente: %s",email);
		System.out.printf("\nIdade do Cliente: %d", idade);
		System.out.printf("\nTelefone para contato com Cliente: %s", telefone);
		
		if(sexo==1) 
		{
			System.out.println("\nSexo: Masculino");
		}
		else 
		{
			System.out.println("\nSexo: Feminino");
		}
		
}
}
