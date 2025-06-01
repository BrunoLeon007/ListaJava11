package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para a tabuada: ");
		int numero = sc.nextInt();

		for (int calculo = 1; calculo <= 10; calculo++) {
		    System.out.println(numero + " x " + calculo + " = " + (numero * calculo));
		}
sc.close();
	}

}
