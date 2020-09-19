import java.util.Scanner;

public class erro {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
	//	try 
	//	{
				System.out.println("Informe uma sequencia de nomes:");
				String lista [] = tec.nextLine().split(" ");
				
				System.out.println("Escolha uma posição de 0 a 5 que deseja ver o nome");
				int posicao = tec.nextInt();
				
				System.out.println(lista[posicao].toString());
				
				System.out.println("Fim do programa");
				
	//	}	
		
		tec.close();

	}

}
