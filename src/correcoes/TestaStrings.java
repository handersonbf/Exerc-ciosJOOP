package correcoes;

public class TestaStrings {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Handerson Frota");
		funcionario.setSalario(1000);
		
		System.out.println(funcionario);
	}

}
