import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main (String args[]) {
		
		int idadeUsuario=0,sexoUsuario=0,temperamentoUsuario=0, usuario=0;
		int mulherNervosa=0,calmo=0,homemAgressivo=0,pessoaCalma=0,pessoaNervosa=0;
		final int LIMITE=149;
		
		Scanner tec = new Scanner(System.in);
		
		while(usuario <= LIMITE) 
		{
			
			System.out.println("Informe a sua idade: ");
			idadeUsuario = tec.nextInt();
			
			System.out.println("Informe o seu Sexo:");
			System.out.println("1:Masculino \n 2:Feminino");
			sexoUsuario = tec.nextInt();
			
			System.out.println("\nTemperamento da pessoa: ");
			System.out.printf("1:Calmo[a] \n2:Nervoso[a] \n3:Agressivo[a]");
			temperamentoUsuario = tec.nextInt();
		
		if(temperamentoUsuario==1) 
		{
				calmo++;
			
				if(idadeUsuario<18) 
				{
					pessoaCalma++;
				}
		}	
		
		else if(sexoUsuario==1 &&temperamentoUsuario==3) 
		{
			homemAgressivo++;	
		}
				
		else if(idadeUsuario>40 && temperamentoUsuario==2) 
		{
			pessoaNervosa++;
		}
		if(sexoUsuario==2 && temperamentoUsuario==2) 
		{
			mulherNervosa++;	
		}	
		
		usuario++;
		}
				System.out.printf("\nTotal de pessoas pesquisadas: %d", usuario);
				System.out.printf("\nNumero de pessoas calma: %d", calmo);
				System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
				System.out.printf("\nNumeros de homens agressivos: %d",  homemAgressivo);
				System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
				System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
				
		

				tec.close();
	}
}
