/*
1- Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		int numero, auxiliar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i += 1) {
			System.out.println("Entre com o numero"+i+": ");
			numero = leia.nextInt();
			
			if(numero > auxiliar) {
				auxiliar = numero;
			}
		}
		
		System.out.println("O maior numero é: " + auxiliar);
	}

}
