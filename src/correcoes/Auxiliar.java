package correcoes;

public class Auxiliar extends Funcionario implements Autenticavel{

	public Auxiliar(){
		super();
	}
	
	public Auxiliar(String nome) {
		super.setNome(nome);
	}

	@Override
	double getBonificacao() {
		return super.getSalario() + 300;
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Autenticou " + getNome());
		return false;
	}
	
}
