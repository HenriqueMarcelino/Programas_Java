package explicacoes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	
	public static void main (String args[]) 
	{
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Henrique Marcelino","Java",7.0);
		Aluno b = new Aluno("Gabriela Vieira","Java",8.0);
		Aluno c = new Aluno("Carlos Henrique","Java",10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
		
	}

}
