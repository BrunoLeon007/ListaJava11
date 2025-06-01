package exercicios;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		int primeiro = 0, segundo = 1, terceiro;
		System.out.println(primeiro);
		System.out.println(segundo);

		for (int numero = 3; numero <= 10; numero++) {
		    terceiro= primeiro + segundo;
		    System.out.println(terceiro);
		    primeiro = segundo;
		    segundo =terceiro;
		}

	}

}
