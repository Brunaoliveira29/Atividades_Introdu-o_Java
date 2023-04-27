/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três 
 * e que se encontram no conjunto dos números de 1 até 500.*/

package estrutura_repeticao;

import java.util.Scanner;

public class numerosImpares {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int soma = 0;
			
			for (int num = 1; num <= 500; num++) {
				
				if ((num % 2 == 1) && (num % 3 == 0)) {
					
					soma += num;
					
					System.out.println(+soma);
					
				}	
			
			}
			
		System.out.println("\tA soma dos ímpares múltiplos de 3 entre 1 e 500");
			
		}

	}

}
