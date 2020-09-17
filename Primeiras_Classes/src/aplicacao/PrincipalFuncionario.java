package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.printf("\nInforme o seu nome: ");
		funcionario.nome = tec.next().toString();
		
		System.out.printf("\nInforme o seu CPF: ");
		funcionario.cpf = tec.nextInt();
		
		System.out.printf("\nMatricula:");
		funcionario.matricula = tec.nextInt();
		
		System.out.printf("\nDepartamento: ");
		funcionario.departamento = tec.next().toUpperCase();
		
		funcionario.mostrarInfo();
		
		
		tec.close();
		
		
		
		
		
		

	}

}
