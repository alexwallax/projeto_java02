package view;

//import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		
		// versões dos tipos primitivos orientado a objetos
		
		Byte b = 100; //byte
		Short s = 1000; //double
		
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //int
		Long l = 100000L; //long
		 
		System.out.println(b.byteValue());
		System.out.println(s.toString()); //transforma em uma string 
		System.out.println(i * 3); 
		System.out.println(l / 3);  
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // converte string para booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());// converte booleano em string e colocando em maiusculas
		
		Character c = '#';
		System.out.println(c.toString()); // convertendo char para uma string
		
		
		//entrada.close();
		
	}

}
