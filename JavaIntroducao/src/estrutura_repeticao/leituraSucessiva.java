/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
 * valores positivos, ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/

package estrutura_repeticao;

import java.util.Scanner;

public class leituraSucessiva {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int num = 0, soma = 0, total = 0;
			float media = 0;
			
			while (num >= 0) {
				
				System.out.println("Digite um valor positivo: ");
				num = input.nextInt();
				
				if (num >= 0) {
					
					soma += num;
					total = total +1;
					
				}
				
			}
			
			media = soma / total;
			
			System.out.println("A soma é: " +soma);
			System.out.println("A média é: " +media);
			System.out.println("O total de valores lidos é: " +total);
			
			
		}

	}

}
