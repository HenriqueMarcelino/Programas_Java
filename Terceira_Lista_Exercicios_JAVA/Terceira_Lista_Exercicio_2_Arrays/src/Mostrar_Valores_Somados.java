import java.util.Scanner;

public class Mostrar_Valores_Somados {

	public static void main(String[] args) {
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */

		Scanner tec = new Scanner(System.in);

		int x=0,somaImpa=0,somaPares=0,contador=1,entradaNumero=0,contadorVezes=1;;
		final int LIMITE =6;
		int vetor[] = new int [LIMITE];
		
		for(x=0; x<LIMITE; x++) 
		{
			System.out.printf("Informe %d� numero:",contador++);
			entradaNumero = tec.nextInt();
			vetor[x] = entradaNumero;		
		}
		for(x=0; x<LIMITE; x++)
		{	
			if(vetor[x]%2==0) 
			{
				somaPares++;
				System.out.printf("O %d� n�mero � par, valor: ",contadorVezes++);
				System.out.println(vetor[x]);
			}
			else
			{
				somaImpa++;
				System.out.printf("O %d� n�mero � impar, valor: ",contadorVezes++);
				System.out.println(vetor[x]);
			}
						
		}
						
		System.out.printf("\nNumero impares:%d",somaImpa);
		System.out.printf("\nNumeros Pares:%d",somaPares);
		
		tec.close();
	}
}