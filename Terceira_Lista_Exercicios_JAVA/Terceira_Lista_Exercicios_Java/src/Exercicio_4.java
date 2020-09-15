import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		
		/* Objetivo

	4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
	Ofereça ao usuário um menu de opções:


(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 

Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado 
da adição da constante deve ser armazenado na própria matriz.	 
*/

/* Entrada
* Processamento
* Saída
*/
		
//Entrada

Scanner tec = new Scanner(System.in);

int matriz1[][] = new int [2][2];
int matriz2[][] = new int [2][2];
int somaMatriz[][] = new int [4][4];
int dadosDigitados, linha=0, coluna=0;
int opcaoContador=1;
int opcao;
final int CONSTANTE;

System.out.println("                 BEM VINDO USUÁRIO !!!                     ");
System.out.println("\nEscolha uma opção abaixo para que possamos proceguir !!");

System.out.printf("\nOPÇÃO %d° = Somar matrizes.",opcaoContador++);

System.out.printf("\nOPÇÃO %d° = Subtrair a primeira matriz da segunda matriz.",opcaoContador++);

System.out.printf("\nOPÇÃO %d° = Adicionar uma constante para as duas matrizes.",opcaoContador++);

System.out.println("\n");
System.out.println("\nQual a opção desejada ? ");
opcao = tec.nextInt();


if(opcao==1) {
//Entrada de dados
System.out.println("\nInforme os numeros da primeira matriz");
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		dadosDigitados = tec.nextInt();
		
		matriz1[linha][coluna] = dadosDigitados;	
	}
}

//Leitura da matriz
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		System.out.println("Dados matriz: " + matriz1[linha][coluna]);
	}
}
System.out.println("\nInforme os numeros da SEGUNDA matriz");
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		dadosDigitados = tec.nextInt();
		
		matriz2[linha][coluna] = dadosDigitados;	
	}
}

for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		System.out.println("Dados matriz 2 : " + matriz2[linha][coluna]);
	}
}

	System.out.println("\nA soma dos valores da matriz 1 com a matriz 2:");

	somaMatriz[0][0] = matriz1[0][0] + matriz2[0][0];
	somaMatriz[1][1] = matriz1[0][1] + matriz2[0][1];
	somaMatriz[2][2] = matriz1[1][0] + matriz2[1][0];
	somaMatriz[3][3] = matriz1[1][1] + matriz2[1][1];
			 	
	System.out.println("Na coluna 0 linha 0 = "+somaMatriz[0][0]);
	System.out.println("Na coluna 0 linha 1 = "+somaMatriz[1][1]);
	System.out.println("Na coluna 1 linha 0 = "+somaMatriz[2][2]);
	System.out.println("Na coluna 1 linha 1 = "+somaMatriz[3][3]);
}

if(opcao==2) {
//Entrada de dados
System.out.println("\nInforme os numeros da primeira matriz");
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		dadosDigitados = tec.nextInt();
		
		matriz1[linha][coluna] = dadosDigitados;	
	}
}

//Leitura da matriz
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		System.out.println("Dados matriz: " + matriz1[linha][coluna]);
	}
}
System.out.println("\nInforme os numeros da SEGUNDA matriz");
for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		dadosDigitados = tec.nextInt();
		
		matriz2[linha][coluna] = dadosDigitados;	
	}
}

for(linha=0; linha<2; linha++) {
	for (coluna=0; coluna<2; coluna++) {
		
		System.out.println("Dados matriz 2 : " + matriz2[linha][coluna]);
	}
}



	System.out.println("\nA subtração dos valores da matriz 1 com a matriz 2:");

	somaMatriz[0][0] = matriz1[0][0] - matriz2[0][0];
	somaMatriz[1][1] = matriz1[0][1] - matriz2[0][1];
	somaMatriz[2][2] = matriz1[1][0] - matriz2[1][0];
	somaMatriz[3][3] = matriz1[1][1] - matriz2[1][1];
			 	
	System.out.println("Na coluna 0 linha 0 = "+somaMatriz[0][0]);
	System.out.println("Na coluna 0 linha 1 = "+somaMatriz[1][1]);
	System.out.println("Na coluna 1 linha 0 = "+somaMatriz[2][2]);
	System.out.println("Na coluna 1 linha 1 = "+somaMatriz[3][3]);
}
 if(opcao==3) {
	//Entrada de dados
	System.out.println("\nInforme os numeros da primeira matriz");
	for(linha=0; linha<2; linha++) {
		for (coluna=0; coluna<2; coluna++) {
			
			dadosDigitados = tec.nextInt();
			
			matriz1[linha][coluna] = dadosDigitados;	
		}
	}

	//Leitura da matriz
	for(linha=0; linha<2; linha++) {
		for (coluna=0; coluna<2; coluna++) {
			
			System.out.println("Dados matriz: " + matriz1[linha][coluna]);
		}
	}
	System.out.println("\nInforme os numeros da SEGUNDA matriz");
	for(linha=0; linha<2; linha++) {
		for (coluna=0; coluna<2; coluna++) {
			
			dadosDigitados = tec.nextInt();
			
			matriz2[linha][coluna] = dadosDigitados;	
		}
	}
	
	for(linha=0; linha<2; linha++) {
		for (coluna=0; coluna<2; coluna++) {
			
			System.out.println("Dados matriz 2 : " + matriz2[linha][coluna]);
		}
	}
	

 	
 System.out.println("\nInforme o valor da CONSTANTE:");
 CONSTANTE = tec.nextInt();
 
 System.out.println("\nA soma das matriz 1 com a matriz 2 com a constante é:");
	
 	somaMatriz[0][0] = (matriz1[0][0] + CONSTANTE) + ( matriz2[0][0] + CONSTANTE);
 	somaMatriz[1][1] = (matriz1[0][1] + CONSTANTE ) + ( matriz2[0][1] + CONSTANTE);
 	somaMatriz[2][2] = (matriz1[1][0] + CONSTANTE ) + (matriz2[1][0] + CONSTANTE);
 	somaMatriz[3][3] = (matriz1[1][1] + CONSTANTE) + ( matriz2[1][1] + CONSTANTE);
 			 	
 	System.out.println("Na coluna 0 linha 0 = "+somaMatriz[0][0]);
 	System.out.println("Na coluna 0 linha 1 = "+somaMatriz[1][1]);
 	System.out.println("Na coluna 1 linha 0 = "+somaMatriz[2][2]);
 	System.out.println("Na coluna 1 linha 1 = "+somaMatriz[3][3]);
 	
}

tec.close();

}

}

