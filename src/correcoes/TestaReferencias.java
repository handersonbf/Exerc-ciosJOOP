package correcoes;

public class TestaReferencias {

	public static void main(String[] args) {
		CaixaDeObejtos caixaDeObejtos = new CaixaDeObejtos();
		
		Conta conta = new Conta();
		Funcionario funcionario = new Gerente();
		caixaDeObejtos.adiciona(conta);
		caixaDeObejtos.adiciona(funcionario);
		caixaDeObejtos.adiciona(new Integer(100));
		
		Integer valorReal = (Integer) caixaDeObejtos.pegaObject(2);
		System.out.println(valorReal);
	}
}
