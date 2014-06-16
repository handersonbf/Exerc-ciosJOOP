package correcoes;

public class TestaManipulacaoStrings {

	public static void main(String[] args) {
		
		String s = "A triadworks possui 2 cursos";
		s.replaceAll("2", "4");
		System.out.println(s);
		
		String frase = "Exercícios de manipulação de Strings";
		
		System.out.println("String: " + frase);
		System.out.println("A String vazia: " + frase.isEmpty());
		System.out.println("Quantidade de caractéres da String: "+ frase.length());
		System.out.println("A string possui a letra X: " + frase.contains("X"));
		System.out.println("A string possui a letra a: " + frase.contains("a"));
		String[] split = frase.split(" ");
		for(String string : split){
			System.out.println(string);
		}
	}

}
