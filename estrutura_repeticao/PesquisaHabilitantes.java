/*

1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

*/

import java.util.Scanner;

public class PesquisaHabilitantes {

	public static void main(String[] args) {
		
			
		double salario, maiorSalario = 0.0, somaSalario = 0.0, mediaSalario = 0.0;
		int numeroFilhos, somaNumeroFilhos = 0, mediaFilhos, percentual = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < 3; i += 1) {
			System.out.println("Digite qual o seu salario: ");
			salario = input.nextDouble();

			System.out.println("Digite a qtd de filhos: ");
			numeroFilhos = input.nextInt();

			if(salario > maiorSalario) {
				maiorSalario = salario;
			} 
			if(salario <= 100) {
				percentual += 1; 
			}

			somaSalario += salario;
			somaNumeroFilhos += numeroFilhos;
		}
		
		mediaSalario = somaSalario / 3;
		mediaFilhos = somaNumeroFilhos / 3;
		percentual = (percentual *100) / 3;

		System.out.println("A média do salário da população: " + mediaSalario);
		System.out.println("A média do número de filhos: " + mediaFilhos);
		System.out.println("O maior salário: " + maiorSalario);
		System.out.println("O percentual de pessoas com salário até R$100,00: " + percentual);	

	}

}
