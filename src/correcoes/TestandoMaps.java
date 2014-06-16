package correcoes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestandoMaps {

	public static void main(String[] args) {
		Map<String, Conta> mapaContas = new HashMap<String, Conta>();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(200);
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(200);
		Conta c = new Conta();
		c.setSaldo(333);
		mapaContas.put("contaPoupanca", cp);
		mapaContas.put("contaCorrente", cc);
		mapaContas.put("conta", c);
		
		Collection<Conta> values = mapaContas.values();
		Iterator<Conta> iterator = values.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
