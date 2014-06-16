package cap15;

import java.util.HashMap;
import java.util.Map;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import conta.Gerente;


public class TestandoMaps {

	public static void main(String[] args) {
		Map<String, Conta> mapaContas = new HashMap();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(200);
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(200);
		Gerente gerente = new Gerente();
		gerente.setNome("Gerente da conta");
		mapaContas.put("contaPoupanca", cp);
		mapaContas.put("contaCorrente", cc);
		
		Conta conta = (Conta) mapaContas.get("contaPoupanca");
		
		System.out.println(conta.getSaldo());
	}

}
