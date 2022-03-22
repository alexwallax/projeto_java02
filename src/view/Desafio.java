package view;

public class Desafio {

	public static void main(String[] args) {
		
		double a = 3 + 2;
		double b = 6 * a;
		double c = Math.pow(b, 2);
		double d = c / (3 * 2);

		System.out.println((int) d);
		
		double e = (1 - 5) * (2 - 7);
		double f = e / 2;
		double g = Math.pow(f, 2);
		
		System.out.println((int) g);
		
		double h = d - g;
		
		System.out.println((int) h);
		
		double i = Math.pow(h, 3);
		double j = Math.pow(10, 3);
		double k = i / j;
		
		System.out.println((int) k);
		
		
	}

}
