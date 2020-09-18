import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		
		Collection <String> estoque = Arrays.asList();
		estoque.add("Lapis");
		estoque.add("Caneta");
		estoque.add("Caderno");
		
		for (int i = 0; i<3;i++ ) 
		{
			System.out.println(estoque);
		}
		
		
		
		
		tec.close();

	}

}
