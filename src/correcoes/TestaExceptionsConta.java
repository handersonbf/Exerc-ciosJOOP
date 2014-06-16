package correcoes;

public class TestaExceptionsConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(100);
		conta.setLimite(200);
		
		try {
			conta.saca(4000);
			System.out.println("Sacou corretamente");
		} catch (LisoException e) {
			System.out.println(e.getMessage());
		}
	}

}
