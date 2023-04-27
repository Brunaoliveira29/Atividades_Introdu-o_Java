/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.*/

package estrutura_repeticao;

import java.util.Scanner;

public class tecladoSoma {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int numero, soma = 0, cont = 1;
			
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			do {
				
				soma += cont;
				cont++; 
				
			} while (cont <= numero);
			
			System.out.println("Somatório " +soma);
		
		}
		

	}

}
