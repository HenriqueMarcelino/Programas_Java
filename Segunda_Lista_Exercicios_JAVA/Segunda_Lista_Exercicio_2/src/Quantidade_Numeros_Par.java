import java.util.Scanner;

public class Quantidade_Numeros_Par 
{

	public static void main(String[] args) 
	{
		
		/*				Proposito do programa
		 * 
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int numero=0,x=0,quantidadepar=0,quantidadeimpa=0;
		
		for(x=1;x<=10;x++) 
		{
			System.out.print("Informe o numero:");
			numero = tec.nextInt();
		
			if(numero%2==0)
			{
				quantidadepar++;
			} else {
				quantidadeimpa++;
			}
		}
			System.out.printf("A quantidade de n�meros pares s�o: %d ",quantidadepar);
			System.out.printf("\nA quantidade de n�meros impares s�o: %d ",quantidadeimpa);
		}
		
	}
		