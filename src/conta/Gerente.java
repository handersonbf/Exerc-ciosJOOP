package conta;

public class Gerente extends Funcionario{

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 10;
	}
	
}
