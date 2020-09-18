package aplicacao;

import java.util.Scanner;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Malvado");
		cachorro.setIdade(5);
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pé de pano");
		cavalo.setIdade(15);
		
		Preguica preguica = new Preguica();
		preguica.setNome("Jurubeba");
		preguica.setIdade(4);

		Animal[] animal = new Animal[3];
		animal[0] = cachorro; 
		animal[1] = cavalo;
		animal[2] = preguica;
		
		for(Animal animais:animal ) 
		{
			System.out.printf("\nO nome do animal é "+ animais.getNome()+ " ele tem "+ animais.getIdade()+ " anos e emiti o som: " + animais.getEmitiSom());
		}
		
		tec.close();

	}

}
