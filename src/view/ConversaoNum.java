package view;

public class ConversaoNum {
	
	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345; // convers�o expl�cita (CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c; // convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // convers�o expl�cita (CAST)
		System.out.println(f);
		
		
	}

}
