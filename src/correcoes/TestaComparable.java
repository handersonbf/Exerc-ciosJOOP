package correcoes;

import java.util.Collections;


public class TestaComparable {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setNumero(800);
		conta1.setSaldo(600);
		
		Conta conta2 = new Conta();
		conta2.setNumero(400);
		conta2.setSaldo(6320);
		
		Conta conta3 = new Conta();
		conta3.setNumero(340);
		conta3.setSaldo(677);
		
		Conta conta4 = new Conta();
		conta4.setNumero(2340);
		conta4.setSaldo(784);
		
		Banco banco = new Banco();
		banco.adicionaConta(conta1);
		banco.adicionaConta(conta2);
		banco.adicionaConta(conta3);
		banco.adicionaConta(conta4);
		
		banco.imprimeContas();
		Collections.sort(banco.getListaContas());
		System.out.println("Lista ordenada:");
		banco.imprimeContas();
	}

}
