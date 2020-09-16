package aplicacao;

import java.util.Scanner;

import entidades.Aviao;
import entidades.Cliente;

public class PrincipalAviao {

	public static void main(String[] args) {
		
Scanner tec = new Scanner(System.in);
		
		Aviao aviao = new Aviao();
		
		System.out.println("BEM VINDO AO SISTEMA AERONATICO !!");
		System.out.println("\nInforme a compania:");
		aviao.compania = tec.next().toUpperCase();
		
		System.out.printf("\nInforme o numero do avião:");
		aviao.numeroAviao = tec.nextInt();
		
		
		aviao.mostraAviao();
	}

}
