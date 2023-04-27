/*Faça um programa que entre com três números e coloque em ordem crescente*/

package estrutura_decisao;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			int num1, num2, num3, aux;
	
			System.out.println("Digite o primeiro número: ");
			num1 = leia.nextInt();
	
			System.out.println("Digite o segundo número: ");
			num2 = leia.nextInt();
	
			System.out.println("Digite o terceiro número: ");
			num3 = leia.nextInt();
	
			if (num1>num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}
			if (num1>num3) {
				aux = num1;
				num1 = num3;
				num3 = aux;
			}
			if (num2>num3) {
				aux = num2;
				num2 = num3;
				num3 = aux;
			}
		
			System.out.println("Ordem crescente: " +num1 +" " +num2 +" " +num3);
	
		}	

	}
	
}
