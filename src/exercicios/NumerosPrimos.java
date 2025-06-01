package exercicios;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int contaPrimos = 0;

		for (int numero = 2; numero <= 100; numero++) {
		    boolean primo = true;
		    for (int resultado = 2; resultado <= Math.sqrt(numero); resultado++) {
		        if (numero % resultado== 0) {
		            primo = false;
		            break;
		        }
		    }
		    if (primo) {
		        contaPrimos++;
		    }
		}
		System.out.println("Números primos entre 1 e 100: " + contaPrimos);

	}

}
