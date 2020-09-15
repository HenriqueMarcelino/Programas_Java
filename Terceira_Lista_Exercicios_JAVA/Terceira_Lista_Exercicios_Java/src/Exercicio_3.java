import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		/*      Objetivo
		 * 	
			3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		int x,soma,coluna,linha,numeroLinha=1,numeroColuna=1,entradaDados=0,contadorLinha=0,contadorColuna=0,totalContador=0;
		final int COLUNA=3;
		final int LINHA=3;
		
		System.out.println("------------Matriz-----------");
		System.out.println("");
		
		for(linha=0;linha<LINHA;linha++)
		{
			System.out.printf("Informe o %d° numero para a linha:",numeroLinha++);
			entradaDados=tec.nextInt();
			if(entradaDados>10)
			{
				contadorLinha++;
			}
			
		}
			System.out.println("");
			for(coluna=0;coluna<COLUNA;coluna++)	
		{		
				System.out.printf("Informe o %d° numero para a coluna:",numeroColuna++);
				entradaDados=tec.nextInt();
				if(entradaDados>10)
				{
					contadorColuna++;
				}
		}
					totalContador=contadorLinha+contadorColuna;
				
					if(totalContador>0) 
				{	
					System.out.printf("\nA quantidade de numeros maiores de 10 foram: %d",totalContador);
				}
				else 
				{
					System.out.println("\nNão foram digitados numeros maiores que 10...");
				}
						System.out.println();
				
			tec.close();
	
	}
	
}
	


