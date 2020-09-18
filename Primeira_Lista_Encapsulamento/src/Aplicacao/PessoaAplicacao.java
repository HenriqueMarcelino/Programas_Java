package Aplicacao;

import java.util.Scanner;

import Entidades.Empregado;
import Entidades.Fornecedor;
import Entidades.Pessoa;

public class PessoaAplicacao {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
	//******TESTES CLASSE CLIENTE**************
	
		System.out.println("Informaçãoes do Cliente");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Henrique");
		pessoa.setEndereco("Rua nunca nem vi, N°666");
		pessoa.setTelefone("(11) 9888-9988");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getTelefone());
	
	//******TESTES CLASSE FORNECEDOR***************
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Generation Brasil LTDA");
		fornecedor.setEndereco("Rua POO, N°100");
		fornecedor.setTelefone("(11) 98787-1111");
		
		System.out.println("\nInforme o valor do credito:");
		fornecedor.setValorCredito(tec.nextDouble());
		
		System.out.println("\nInforme o valor da divida:");
		fornecedor.setValorDivida(tec.nextDouble());
		
		System.out.println("\nO valor restante do credito é R$: " + fornecedor.obterSaldo());
		
		System.out.println("\nInformações do fornecedor:"); 
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getTelefone());
		
	//******TESTES CLASSE EMPREGADO	***************
		Empregado empregado = new Empregado();
		
		System.out.println("\nInformações do Empregado:"); 
		empregado.setNome("Asnaldo");
		empregado.setCodigoSetor(25);
		empregado.setEndereco("Rua São benedito N°555");
		empregado.setSalarioBase(2000);
		empregado.setTelefone("(11) 96565-6262");
		empregado.setImposto(10);
		
		System.out.println(empregado.getNome());
		System.out.println(empregado.getCodigoSetor());
		System.out.println(empregado.getEndereco());
		System.out.println(empregado.getTelefone());
		System.out.println(empregado.getSalarioBase());
		System.out.println(empregado.getImposto());
		
		System.out.println("Salario com desconto de impostos:"+ empregado.calculoDeSalario());
		tec.close();
	
	
	}

		
	
}
