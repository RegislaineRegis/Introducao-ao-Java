/*
4- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por 
três  (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
 digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/
import java.util.Scanner;

public class MultiplicadoPorTres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorRecebido;

		System.out.println("Digite o valor númerico: ");
		valorRecebido = input.nextInt();

		while(valorRecebido <= 150) {
			System.out.println("Sua sequencia é: " + valorRecebido);
			valorRecebido = valorRecebido * 3;				
		}	
	}
}

