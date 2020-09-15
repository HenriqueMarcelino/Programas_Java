import java.util.Scanner;

public class Mostrar_Valores_Somados {

	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */

		Scanner tec = new Scanner(System.in);

		int x=0,somaImpa=0,somaPares=0,contador=1,entradaNumero=0,contadorVezes=1;;
		final int LIMITE =6;
		int vetor[] = new int [LIMITE];
		
		for(x=0; x<LIMITE; x++) 
		{
			System.out.printf("Informe %d° numero:",contador++);
			entradaNumero = tec.nextInt();
			vetor[x] = entradaNumero;		
		}
		for(x=0; x<LIMITE; x++)
		{	
			if(vetor[x]%2==0) 
			{
				somaPares++;
				System.out.printf("O %d° número é par, valor: ",contadorVezes++);
				System.out.println(vetor[x]);
			}
			else
			{
				somaImpa++;
				System.out.printf("O %d° número é impar, valor: ",contadorVezes++);
				System.out.println(vetor[x]);
			}
						
		}
						
		System.out.printf("\nNumero impares:%d",somaImpa);
		System.out.printf("\nNumeros Pares:%d",somaPares);
		
		tec.close();
	}
}