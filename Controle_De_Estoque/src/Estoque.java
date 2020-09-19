
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		
		Collection <String> estoque = new ArrayList();
		estoque.add("Lapis");
		estoque.add("Caneta");
		estoque.add("Caderno");
		
		System.out.println("Estoque completo: "+estoque);
		
		estoque.remove("Lapis");
		System.out.println("Estoque com um item retirado: "+estoque);
	
		tec.close();

	}

}
