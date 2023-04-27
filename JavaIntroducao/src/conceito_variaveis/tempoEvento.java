/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package conceito_variaveis;

import java.util.Scanner;

public class tempoEvento {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int segundos, minutos, horas;
			
			System.out.println("Digite o tempo em segundos: ");
			segundos = input.nextInt();
			
			horas = segundos / 3600;
			minutos = (segundos % 3600) / 60;
			segundos = (segundos % 3600) % 60;
			
			System.out.println("O tempo de duração do evento foi de: ");
			
			System.out.println(+horas +" horas " +minutos +" minutos e " +segundos +" segundos");
		}
		
	}

}
