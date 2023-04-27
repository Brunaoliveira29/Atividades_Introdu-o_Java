/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

package conceito_variaveis;

import java.util.Scanner;

public class pessoaIdade {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int dias, meses, anos;
			
			System.out.println("Digite sua idade em dias: ");
			dias = input.nextInt();
			
			anos = dias / 365;
			meses = (dias % 365) / 30;
			dias = (dias % 365) % 30;
			
			System.out.println("Seu tempo na terra até o momento é: " +anos + " anos " +meses + " meses " +dias + " dias");
		}	

	}

}
