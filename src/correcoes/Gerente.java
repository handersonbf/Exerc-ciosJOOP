package correcoes;

public class Gerente extends Funcionario implements Autenticavel{

	public Gerente(){
		super();
	}
	
	public Gerente(String nome) {
		super.setNome(nome);
	}

	@Override
	double getBonificacao() {
		return super.getSalario() + (super.getSalario()*5/100);
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Autenticou " + getNome());
		return false;
	}

}
