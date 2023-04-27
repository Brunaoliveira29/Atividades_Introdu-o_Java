/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três (imprimindo o novo valor) 
 * até que ele seja maior do que 100. Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/

package estrutura_repeticao;

import java.util.Scanner;

public class multiplicarTres {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int numero;
			
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			System.out.println("\n"+numero);
			
			while (numero <= 100) {
				
				numero *= 3;
				System.out.println(+numero);
				
			}
			
		}
		
	}

}
