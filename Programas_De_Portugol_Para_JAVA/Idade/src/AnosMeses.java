import java.util.Scanner;

public class AnosMeses {

	public static void main(String[] args) {
	
	Scanner kb = new Scanner (System.in);
	
	int mes=12;
	
	int	id,an,at,msinf,ms=12,ds,resul;
	
	System.out.print("Informe o dia de nascimento :");
	ds=kb.nextInt();
	
	System.out.print("Informe o mes de nascimento :");
	msinf=kb.nextInt();
	
	System.out.print("Informe o ano de nascimento :");
	an = kb.nextInt();
			
	System.out.print("Informe o ano atual :");
	at=kb.nextInt();
	
	
		id=(at-an);
		ms=(id*ms);
		ds=id*365;
		
		System.out.println("A sua idade é : "+id + " Anos " +ms + " Meses " + " Dias "+ds);
		
		kb.close();

	}

}
