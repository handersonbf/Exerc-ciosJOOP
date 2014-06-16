package correcoes;

public class GerenciamentoDeContas {

	public static void main(String[] args) {
		Conta contaHanderson = new Conta();
		contaHanderson.getCliente().setNome("Handerson Frota");
		contaHanderson.setNumero(10);
		contaHanderson.setSaldo(20);
		contaHanderson.setLimite(100);
		
		Conta contaRafael = new Conta();
		contaRafael.getCliente().setNome("Rafael Ponte");
		contaRafael.setNumero(43);
		contaRafael.setSaldo(299);
		contaRafael.setLimite(900);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Conta");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Dono: " + contaHanderson.getCliente().getNome());
		System.out.println("Número: " + contaHanderson.getNumero());
		System.out.println("Saldo: " + contaHanderson.getSaldo());
		System.out.println("Limite: " + contaHanderson.getLimite());
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Conta");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Dono: " + contaRafael.getCliente().getNome());
		System.out.println("Número: " + contaRafael.getNumero());
		System.out.println("Saldo: " + contaRafael.getSaldo());
		System.out.println("Limite: " + contaRafael.getLimite());
		
	}

}
