package correcoes;

public class TestandoReferencias {

	public static void main(String[] args) throws LisoException {
		Conta conta = new Conta();
		conta.setSaldo(2000);
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.deposita(500);
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		Conta contaDestino = new Conta();
		contaDestino.setSaldo(0);
		System.out.println("Saldo anterior conta principal: " + conta.getSaldo());
		System.out.println("Saldo anterior conta destino: " + contaDestino.getSaldo());
		conta.transferePara(contaDestino, 500);
		System.out.println("Saldo anterior conta principal: " + conta.getSaldo());
		System.out.println("Saldo anterior conta destino: " + contaDestino.getSaldo());
	}

}
