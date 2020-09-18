package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceiro;


	public class Principal {
	
		public static void main(String[] args) {
			int hora;
			int valor;
			double valorExtra;
			String nomeFunc;
			String info;
		
			Scanner tec= new Scanner(System.in);
			
			List<Funcionario> list = new ArrayList<>();
			
			
			System.out.print("SISTEMA DE CADASTRO  DE FUNCIONARIO: ");
		
			for ( int i = 1; i<=3; i++)
		{	
			System.out.print("\nNome do funcionario: ");
			nomeFunc = tec.next().toUpperCase();
				
			System.out.print("\nO funcionário é terceiro [S/N] :");
			info = tec.next().toUpperCase().charAt(0);
			
						
			System.out.print("\nInforme as horas trabalhadas: ");
			hora = tec.nextInt();
			
			System.out.print("\nInforme o Valor da hora trabalhada:");
			valor = tec.nextInt();
			
			if (info == 'S')
			{
				System.out.println("\nInforme o valor extra adicional: ");
				valorExtra = tec.nextDouble();
			
				list.add(new FuncionarioTerceiro(nomeFunc,hora,valor,valorExtra));
				
			}
			else
			{
				list.add(new Funcionario(nomeFunc, hora, valor));
			}
			
		}
				System.out.println();
				System.out.println("RELAÇÃO DE PAGAMENTOS");
				
		for (Funcionario func : list)
		{
			System.out.println(func.getNome()+" "+func.pagamento());
		}
		
	}
}