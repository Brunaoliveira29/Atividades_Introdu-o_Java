package classe_scanner;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura;
		double area;
		char tipo;
		String palavra;
		
		System.out.println("Digite um valor para a Variavel quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("Digite um valor para a Variavel identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("Digite um valor para a Variavel altura (float): ");
		altura = leia.nextFloat();
		
		System.out.println("Digite um valor para a Variavel area (double): ");
		area = leia.nextDouble();
		
		System.out.println("Digite um valor para a Variavel tipo (char): ");
		tipo = leia.next().charAt(0);
		
		System.out.println("Digite um valor para a Variavel palavra (string): ");
		palavra = leia.next();
		
		System.out.println("\nVariavel quantidade = " + quantidade);
		System.out.println("\nVariavel identificador = " + identificador);
		System.out.println("\nVariavel altura = " + altura);
		System.out.println("\nVariavel area = " + area);
		System.out.println("\nVariavel tipo = " + tipo);
		System.out.println("\nVariavel palavra = " + palavra);
		
		leia.close();

	}

}


