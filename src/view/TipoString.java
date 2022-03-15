package view;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Texto de teste".charAt(0)); // charAt vai mostra a letra no indice zero
		
		String s = "Bom dia";
		//s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom")); // verifica se a palavra inicia com "Bom" (retorna true ou false)
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia")); // verifica se termina com "dia"
		System.out.println(s.length()); // para saber quantos caracteres tem uma string
		System.out.println(s.equals("Bom dia")); // verifica igualdade
		System.out.println(s.equalsIgnoreCase("bom dia")); 
		
		var nome = "Alex";
		var sobrenome = "Wallace";
		var idade = 35;
		var salario = 12345.987;

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n");
		
		System.out.printf("O senhor %s %s tem %d anos, e ganha R$ %.2f. \n", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos, e ganha R$ %.2f. ", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}

}

