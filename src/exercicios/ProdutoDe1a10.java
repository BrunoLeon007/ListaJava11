package exercicios;

public class ProdutoDe1a10 {

	public static void main(String[] args) {
		
		long produto = 1;
		for (int total = 1; total <= 10; total++) {
		    produto *= total;
		}
		System.out.println("Produto de 1 a 10: " + produto);

	}

}
