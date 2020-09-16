package aplicacao;

import java.util.Scanner;

import entidades.Cliente;



public class Principal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("BEM VINDO CLIENTE !!");
		System.out.println("\nInforme o seu nome :");
		cliente.nome = tec.next().toUpperCase();
		
		System.out.printf("\nInforme seu email para receber nossas promoções e lançamentos de cartôes:");
		cliente.email = tec.next();
		
		System.out.printf("\nInforme seu telefone para contato: ");
		cliente.telefone = tec.next();
		
		System.out.println("\nInforme a sua idade :");
		cliente.idade = tec.nextInt();
		
		System.out.println("Informe seu sexo abaixo");
		System.out.println("Escolha uma opção:");
		System.out.println("\n1° Masculino ou 2° feminino");
		cliente.sexo = tec.nextInt();
		
		cliente.mostrarCliente();
		
		
		tec.close();

	}

}
