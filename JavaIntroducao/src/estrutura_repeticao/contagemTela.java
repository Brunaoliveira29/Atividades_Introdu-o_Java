/*Faça um programa que mostre uma contagem na tela de 233 a 456,
 só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

package estrutura_repeticao;

import java.util.Scanner;

public class contagemTela {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int numero = 233;
			
			System.out.println("Número: ");
			
			do {
				
				if (numero >= 300 && numero <= 400) {
					
					numero += 3;
					
					System.out.println("Contando de 3 em 3: " +numero);
					
				} else {
					
					numero += 5;
					System.out.println("Contando de 5 em 5: " +numero);
					
				}
				
			} while (numero <= 456);
			
			
		}
		

	}

}
