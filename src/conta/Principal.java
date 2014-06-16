package conta;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(400);
		
		//System.out.println(conta.getSaldo());
		
//		for (int i = 1; i < 40; i++) {
//			if (i % 19 == 0) {
//				System.out.println("Achei um número divisível por 19 entre 1 e 40");
////				continue;
//			}
//			System.out.println(i);
//		}
//		
		Diretor d = new Diretor();
		
		System.out.println(d.getBonificacao());
	}
}