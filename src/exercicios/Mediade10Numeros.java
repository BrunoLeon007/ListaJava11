package exercicios;

import java.util.Scanner;

public class Mediade10Numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		for (int calculo = 1; calculo <= 10; calculo++) {
		    System.out.print("Digite o número " + calculo + ": ");
		    double numero = sc.nextDouble();
		    soma += numero;
		}
		double media = soma / 10;
		System.out.println("Média: " + media);
sc.close();
	}

}
