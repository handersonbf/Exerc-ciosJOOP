package correcoes;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Conta c1 = new Conta();
		c1.setNumero(2323);
		Conta c2 = new Conta();
		c2.setNumero(9899);
		Conta c3 = new Conta();
		c3.setNumero(4553);
		
		banco.adicionaConta(c1);
		banco.adicionaConta(c2);
		banco.adicionaConta(c3);
		
		for (Conta conta: banco.getListaContas()) {
			System.out.println(conta);
		}
	}

}
