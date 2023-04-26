/*
3- Elaborar um programa que efetue a leitura sucessiva de 
valores numéricos e apresente no final o total do somatório, a média e o total de valores 
lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/

import java.util.Scanner;

public class LeituraSucessivaNumPositivo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorRecebido = 0, soma = 0,  qtdValorLido = 0, media = 0;

		while(valorRecebido > -1) {
				
			soma += valorRecebido;			
				
			System.out.println("Digite o valor númerico: ");
			valorRecebido = input.nextInt();
			qtdValorLido += 1;		
		}
	
		media = soma/qtdValorLido;
		System.out.println("Seu somatorio é: " + soma);
		System.out.println("A quantidade lida é: " + qtdValorLido);
		System.out.println("Sua média é: " + media);		
	}
}
