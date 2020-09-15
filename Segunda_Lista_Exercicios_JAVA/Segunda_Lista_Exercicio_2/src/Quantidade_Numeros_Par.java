import java.util.Scanner;

public class Quantidade_Numeros_Par 
{

	public static void main(String[] args) 
	{
		
		/*				Proposito do programa
		 * 
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
			System.out.printf("A quantidade de números pares são: %d ",quantidadepar);
			System.out.printf("\nA quantidade de números impares são: %d ",quantidadeimpa);
		}
		
	}
		