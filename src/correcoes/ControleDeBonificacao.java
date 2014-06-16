package correcoes;

public class ControleDeBonificacao {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		System.out.println("Registrando bonificacao para: "
				+ funcionario.getNome() + " no valor de "
				+ funcionario.getBonificacao());
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
}
