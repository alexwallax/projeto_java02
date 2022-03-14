package view;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); // substitui caracteres
		
		s = s.toUpperCase(); // coloca todas as letras em maiusculas
		
		s = s.concat("!!!"); //concatena com outra string
	
		System.out.println(s);
		
		System.out.println("Alex".toUpperCase());
		
		
		String y = "Bom dia X"
				.replace("X", "Alex")
				.toUpperCase()
				.concat("!!!");
		
		
		System.out.println(y);
		
	}

}
