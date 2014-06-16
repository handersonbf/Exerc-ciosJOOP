package correcoes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> listaContas = new ArrayList<Conta>();

	public List<Conta> getListaContas() {
		return listaContas;
	}

	public void adicionaConta(Conta conta) {
		this.listaContas.add(conta);
	}
	
	public void imprimeContas(){
		for (Conta c : this.listaContas) {
			System.out.println(c);
		}
	}
	
}
