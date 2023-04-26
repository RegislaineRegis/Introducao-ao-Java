/*
2- Faça um programa que entre com três números e coloque em ordem crescente.
*/

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
	int numero1, numero2, numero3, auxiliar = 0;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Entre com o numero1: ");
		numero1 = leia.nextInt();
		
		System.out.println("Entre com o numero2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Entre com o numero3: ");
		numero3 = leia.nextInt();
		
		if(numero2 > numero1) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}
		if(numero3 > numero1) {
			auxiliar = numero3;
			numero3 = numero1;
			numero1 = auxiliar;
		}
		if(numero3 > numero2) {
			auxiliar = numero3;
			numero3 = numero2;
			numero2 = auxiliar;
		}
		
		System.out.println("A ordem crescente final é: " + numero1 + " , "+ numero2+ " , "+ numero3);
			
	}

}
