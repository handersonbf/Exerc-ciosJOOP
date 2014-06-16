package conta;

abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	
	public double getBonificacao() {
		return 100;
	}
	
	//outros métodos
}
