/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package estrutura_decisao;

import java.util.Scanner;

public class numeroMaior {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			int num1, num2, num3;
			
			System.out.println("Digite o primeiro número: ");
			num1 = leia.nextInt();
			
			System.out.println("Digite o segundo número: ");
			num2 = leia.nextInt();
			
			System.out.println("Digite o terceiro número: ");
			num3 = leia.nextInt();
			
			if((num1>num2) && (num1>num3)) {
				System.out.println("O maior é: " +num1);
			}
			if ((num2>num1) && (num2>num3)) {
				System.out.println("O maior é: " +num2);
			}
			if ((num3>num1) && (num3>num2)) {
				System.out.println("O maior é: " +num3);	
			}
		}		
	}
}
