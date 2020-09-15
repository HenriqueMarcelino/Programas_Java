import java.util.Scanner;

public class Tenario {

	public static void main(String[] args) {
		
		int dig=0;
		
		Scanner tec = new Scanner(System.in);

		System.out.println("Escolha uma opcção que defina o seu sexo ");
		
		System.out.println("-----------------------------------------");
		
		System.out.println("1-Masculino");
		
		System.out.println("2-Feminino");
		
		System.out.println("3-Outros");
		
		dig=tec.nextInt();
		
		System.out.print( (dig==1)? "Masculino":(dig==2)? "Feminino":(dig==3)? "Outros":"Digitos não exatos");
		
		tec.close();

	}

}

