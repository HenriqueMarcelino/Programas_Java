package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;




	public class Principal {
	
		public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.println("INFORMAÇÕES FUNCIONÁRIOS");
		System.out.println();
		
		Funcionario funcionario = new Funcionario("Henrique");
		
		funcionario.setHorasTrabalhadas(40);
		funcionario.setValorPorHora(40);
		
		System.out.println("Pagamento: R$ "
				+ funcionario.pagamento(funcionario.getHorasTrabalhadas(), funcionario.getValorPorHora()));
		tec.close();
	}
}