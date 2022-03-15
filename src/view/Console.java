package view;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");  // print mantem na mesma linha
		System.out.print(" dia!\n");
		
		System.out.println("Bom"); // println quebra a linha
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n %n", 1, 2, 3, 4, 5, 6); // %n tamb�m quebra a linha
		
		System.out.printf("\nSal�rio: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jo�o Pedro");
		
		Scanner entrada = new Scanner(System.in); // entrada do sistema
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		//System.out.println("\nSeu nome � " + nome + " " + sobrenome + " " + idade);
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close(); // fechando o Scanner
		
	}
	
}

















