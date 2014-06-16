package correcoes;

public class TestaEquals {

	public static void main(String[] args) {
		Conta contaHanderson = new Conta();
		Cliente handerson = new Cliente();
		handerson.setNome("Handerson Frota");
		contaHanderson.setCliente(handerson);
		contaHanderson.setNumero(262626);

		Conta contaWilliam = new Conta();
		Cliente william = new Cliente();
		william.setNome("William Frota");
		contaWilliam.setCliente(william);
		contaWilliam.setNumero(010101);
		
		if(contaHanderson.equals(contaWilliam)){
			System.out.println("As contas são iguais!");
		}else{
			System.out.println("As contas são diferentes!");
		}
		
	}

}
