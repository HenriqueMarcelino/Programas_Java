package explicacoes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	
	public static void main(String[] args) 
	{	
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("Henrique Marcelino","Java",7.0);
		Aluno b = new Aluno("Gabriela Vieira","Java",8.0);
		Aluno c = new Aluno("Carlos Henrique","Java",10);
		
		mapa.put("Henrique Marcelino",a);
		mapa.put("Gabriela Vieira",b);
		mapa.put("Carlos Henrique", c);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Henrique Marcelino"));
		
		Collection<Aluno> aluno = mapa.values();
		
		for(Aluno e: aluno ) 
		{
			System.out.println(e);
		}
	}

}
