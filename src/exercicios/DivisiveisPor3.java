package exercicios;

public class DivisiveisPor3 {

	public static void main(String[] args) {
	
		int contadora = 0;
		
		for(int numero = 1; numero < 51; numero ++ ) {
			
			if(numero % 3 == 0) {
				contadora ++ ;
			}
		}
System.out.println("A quantidade de numeros divisíveis por três é:"+ contadora);
	}

}
