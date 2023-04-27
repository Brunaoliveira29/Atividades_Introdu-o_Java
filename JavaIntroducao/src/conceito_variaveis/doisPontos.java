/*Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 * escreva a distância entre eles. A fórmula que efetua tal cálculo é:*/

package conceito_variaveis;

import java.util.Scanner;

public class doisPontos {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double x1, x2, y1, y2, d;
			
			System.out.println("\tP(x1, y1)");
			
			System.out.println("Valor de x1");
			x1 = input.nextDouble();
			
			System.out.println("Valor y1");			
			y1 = input.nextDouble();
			
			System.out.println("\tP(x2, y2)");
			
			System.out.println("Valor de x2");
			x2 = input.nextDouble();
			
			System.out.println("Valor y2");			
			y2 = input.nextDouble();
			
			d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 

			
			System.out.println("Distância: " +d);	
			
		}		

	}

	@SuppressWarnings("unused")
	private static int pow(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
