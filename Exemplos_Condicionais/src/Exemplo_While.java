import java.util.Scanner;

public class Exemplo_While {

	public static void main(String[] args) {

int idade=0;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Informe a sua idade ");
		idade=tec.nextInt();
		
		do
		{
			System.out.printf("Idade: %d Anos" ,idade);
			
			if(idade>=18) 
			{
				System.out.printf("\nVocê é maior de idade !!");
			}
			else 
			{
				System.out.printf("\nVocê é menor de idade...");
			}
			
			System.out.printf("\nInforme a sua idade ");
			idade=tec.nextInt();
		}
			while(idade>=1); 
			
		
		
	}

}
