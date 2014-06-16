package correcoes;

public class ExceptionJava {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			cutruvia();
			System.out.println("fim do main");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Qual foi o erro? " + e);
		}
	}
	static void cutruvia(){
		System.out.println("inicio: metodo cutruvia()");
		catiroba();
		System.out.println("fim: metodo cutruvia()");
	}
	
	static void catiroba(){
		System.out.println("inicio do catiroba");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;			
			System.out.println(i);
		}
		System.out.println("fim do catiroba");
	}

}
