/*
6- Faça um programa que pegue um número do teclado e calcule a soma de 
todos os números  de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, 
pois  1+2+3+4+5+6+7=28.
*/
import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero, soma = 0;
			
		System.out.println("Digite o numero: ");
		numero = input.nextInt();
		
		do {
			soma += numero;
			numero -= 1;
		} while(numero > 0);

		System.out.println("O Samatorio do numero é : "+ soma);
	}

}

