package cap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import conta.Conta;

public class OrdenaConta {

	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		
		Conta conta1 = new Conta();
		conta1.deposita(40);
		
		Conta conta2 = new Conta();
		conta2.deposita(400);
		
		Conta conta3 = new Conta();
		conta3.deposita(100);
		
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		
		System.out.println(lista.toString());
		
		Collections.sort(lista); 
	}

}
