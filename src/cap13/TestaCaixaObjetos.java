package cap13;

import conta.Conta;

public class TestaCaixaObjetos {

	public static void main(String[] args) {
		CaixaDeObjetos guardador = new CaixaDeObjetos();
		Conta conta = new Conta();
		guardador.adiciona(conta);
		// pega a conta
		Object object = guardador.pegaObjeto(0);
		
		String s = "Exercícios de manipulação de Strings";
		
		System.out.println("String: " + s);
		System.out.println("A String vazia: " + s.isEmpty());
		System.out.println("Quantidade de caractéres da String: "+ s.length());
		System.out.println("A string possui a letra X: " + s.contains("X"));
		System.out.println("A string possui a letra a: " + s.contains("a"));
		String[] split = s.split(" ");
		for(String string : split){
			System.out.println(string);
		}
		
		
	}

}
