package principal;

import java.util.Scanner;

public class ContaGeral {

    public static void main(String[] args) 
    {            
        int opc,dep;
        double limiteConta = 5000;
        Scanner tec = new Scanner(System.in);    
        
        System.out.println("\n************BEM VINDO AO BANCO SQUED************");
        System.out.println("\nEscolha uma opc�es para prosseguir ");
        System.out.println("\n1 CONTA CORRENTE");
        System.out.println("2 CONTA POUPA�A");
        System.out.println("3 CONTA EMPRESA ");
        opc = tec.nextInt();
        
        if (opc==1)
    {        
        System.out.println("\nOP��O 1 CONTA CORRETE ESCOLHIDA");
        System.out.println("\nINFORME O NUMERO DA AGENCIA:");
        int agencia = tec.nextInt();
        System.out.println("\nINFORME O NUMERO DA CONTA:");
        int contaCorrente = tec.nextInt();
        
        System.out.println("\n************BEM VINDO CLIENTE SQUED************");
        System.out.printf("\nAGENCIA:%d ",agencia);
        System.out.printf("\nCONTA CORRENTE:%d ",contaCorrente);
        System.out.println();
        System.out.println("\n************INFORME O SERVI�O DESEJADO************");
        System.out.println();
        System.out.println("\n1 DEPOSITO ");
        System.out.println("2 SALDO ");
        System.out.println("3 EXTRATO CONTA CORRENTE ");
        opc = tec.nextInt();
        
// entrada de opcao conta corrente
            
            if(opc==1)
        {            
            System.out.println("\nQUAL O VALOR DO DEPOSITO? ");
            dep = tec.nextInt();
            System.out.println("TRANSA��O EFETUADA...");
        }
            else if(opc==2)
        {    
            System.out.println("\nSALDO CONTA CORRENTE");
        }
            else if(opc==3) 
        {
            System.out.println("\nEXTRATO CONTA CORRENTE");
        }
    }
            
        else if (opc==2)
    {            
            System.out.println("\nOPC��O 2 CONTA POUPAN�A ESCOLHIDA");
            System.out.println("\n INFORME O NUMERO DA AGENCIA:");
            int agencia = tec.nextInt();
            System.out.println("\nINFORME O NUMERO DA CONTA:");
            int contaPoupanca = tec.nextInt();
            
            System.out.println("\n************BEM VINDO CLIENTE SQUED CONTA POUPAN�A************");
            System.out.printf("\nAGENCIA:%d ",agencia);
            System.out.printf("\nCONTA CORRENTE:%d",contaPoupanca);
            System.out.println();
            System.out.println("\n************INFORME O SERVI�O DESEJADO************");
            System.out.println();
            System.out.println("\n1 DEPOSITO");
            System.out.println("2 SALDO");
            System.out.println("3 EXTRATO CONTA CORRENTE");
            opc = tec.nextInt();
            
            if(opc==1)
        {            
            System.out.println("\nQUAL O VALOR DO DEPOSITO? ");
                dep = tec.nextInt();
                System.out.println("TRANSA��O EFETUADA...");
        }
            if(opc==2)
        {    
                System.out.println("\nSALDO CONTA POUPAN�A");
        }
            if(opc==3) 
        {
                System.out.println("\nEXTRATO CONTA POUPAN�A");
        }
	
    }
        else if (opc==3)
        {        
	        System.out.println("\nOP��O 3 CONTA EMPRESA ESCOLHIDA");
	        System.out.println("\nINFORME O NUMERO DA AGENCIA:");
	        int agencia = tec.nextInt();
	        System.out.println("\nINFORME O NUMERO DA CONTA:");
	        int contaJuridica = tec.nextInt();
	        
	        System.out.println("\n************BEM VINDO CLIENTE SQUED PESSOA JURIDICA************");
	        System.out.printf("\nAGENCIA:%d ",agencia);
	        System.out.printf("\nCONTA EMPRESA:%d ",contaJuridica);
	        System.out.println();
	        System.out.println("\n************INFORME O SERVI�O DESEJADO************");
	        System.out.println();
	        System.out.println("\n1 DEPOSITO");
	        System.out.println("2 SALDO");
	        System.out.println("3 EXTRATO CONTA EMPRESA");
			System.out.println("4 EMPRESTIMO");
			System.out.println("5 LIMITE DA CONTA EMPRESA");
			opc=tec.nextInt();
	    	
		 if(opc==1)
        {            
			 System.out.println("\nQUAL O VALOR DO DEPOSITO? ");
		     dep = tec.nextInt();
		     System.out.println("TRANSA��O EFETUADA...");
        }

		 if(opc==2)
		 {    
			 System.out.println("\nSALDO CONTA JURIDICA");
		 }

		 if(opc==3) 
		 {
			 System.out.println("\nEXTRATO CONTA POUPAN�A");
		 }
		
		 if(opc==4) 
		 {
			 System.out.println("\nEMPRESTIMO");
			 System.out.println("QUAL O VALOR DO EMPRESTIMO?");
			 double emprestimo = tec.nextInt();
		 
			 if(emprestimo>limiteConta) 
			 {
				 System.out.println("\nEMPRESTIMO N�O APROVADO");
				 System.out.printf("\nLIMITE DA CONTA:%.2f",limiteConta);
				 System.out.printf("\nVALOR SOLICITADO:%f",emprestimo);
				 
			 }
			 else if(emprestimo<limiteConta)
			 {
				 System.out.println("\nEMPRESTIMO APROVADO!!");
				 System.out.printf("\nLIMITE DA CONTA:%.2f",limiteConta);
				 System.out.println("\nLIMITE CONTA + EMPRESTIMO = " + (emprestimo+limiteConta));
				 
			 } 
		 }
		 	if(opc==5) 
		 	{
		 		System.out.printf("\nO LIMITE DA CONTA �:%.2f",limiteConta);
		 	}
		 
        }		
    }
}

					
					
				
		
		
