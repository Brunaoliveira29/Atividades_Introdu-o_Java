/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,respectivamente.*/

package conceito_variaveis;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double n1, n2, n3, media;
			
			System.out.println("Digite a nota 1: ");
			n1 = input.nextDouble();
			
			System.out.println("Digite a nota 2: ");
			n2 = input.nextDouble();
			
			System.out.println("Digite a nota 3: ");
			n3 = input.nextDouble();
			
			media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			
			System.out.println("A média final do aluno é: " +media);
		
		}
			
	}

}
