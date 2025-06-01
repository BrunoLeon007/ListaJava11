package exercicios;

public class Divisiveispor3Entre1a50 {

	public static void main(String[] args) {
		
		int conta = 0;
		for (int numero = 1; numero <= 50; numero++) {
		    if (numero % 3 == 0) {
		        conta++;
		    }
		}
		System.out.println("Quantidade de números divisíveis por 3 entre 1 e 50: " + conta);

	}

}
