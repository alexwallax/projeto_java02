package view;

public class DesafioLogico {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2; // ou exclusivo
		boolean tomarSorvete = trabalho1 || trabalho2;
		boolean naoTomouSorvete = !tomarSorvete; // Operador Unário
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Tomou sorvete " + tomarSorvete);		
		System.out.println("Fica mais saudável " + naoTomouSorvete);
		
		
	}

}
