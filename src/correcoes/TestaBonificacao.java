package correcoes;

public class TestaBonificacao {

	public static void main(String[] args) {
		Funcionario diretor = new Diretor("Guilherme Frota");
		diretor.setSalario(2030);
		
		Funcionario gerente = new Gerente("Nahan Frota");
		gerente.setSalario(2300);
		
		Funcionario auxiliar = new Auxiliar("William Frota");
		auxiliar.setSalario(2500);
		
		ControleDeBonificacao controleDeBonificacao = new ControleDeBonificacao();
		controleDeBonificacao.registra(diretor);
		controleDeBonificacao.registra(gerente);
		controleDeBonificacao.registra(auxiliar);
	}
}
