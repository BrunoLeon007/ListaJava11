package exercicios;

import java.util.Scanner;

public class NumeroFatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para calcular o fatorial: ");
		int resultado = sc.nextInt();
		long fatorial = 1;

		for (int numero = 1; numero <= resultado; numero++) {
		    fatorial *= resultado;
		}
		System.out.println("Fatorial de " + resultado + " é " + fatorial);
		sc.close();
	}

}
