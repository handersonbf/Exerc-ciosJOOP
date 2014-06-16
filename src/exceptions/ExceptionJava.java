package exceptions;

public class ExceptionJava {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		cutruvia();
		System.out.println("fim do main");

	}

	static void cutruvia(){
		System.out.println("inicio: metodo cutruvia()");
			catiroba();
			System.out.println("fim: metodo cutruvia()");
	}
	
	static void catiroba(){
		System.out.println("inicio do catiroba");
		int[] array = new int[10];
		try {
			for (int i = 0; i <= 15; i++) {
				array[i] = i;			
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Qual foi o erro? " + e);
		}
		
		System.out.println("fim do catiroba");
	}
}
