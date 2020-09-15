import java.util.Scanner;

public class Informa_Numeros_1000_a_1999 {

	public static void main(String[] args) {

	/*					Proposito do programa
	 * 
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
	 */
	
		Scanner tec = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informando numeros que divididos por 11 o resto é igual a 5");
		System.out.print("\n---------------------------------------------------------");
	
		for(numero=1;numero<=100;numero++) 
		{
				
			if(numero/11==5)
			{
				System.out.printf("\n%d ",numero);
			}
				
			tec.close();
		}
		
	}

}
