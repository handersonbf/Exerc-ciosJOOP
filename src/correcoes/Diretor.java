package correcoes;

public class Diretor extends Funcionario implements Autenticavel{

	public Diretor(){
		super();
	}
	public Diretor(String nome) {
		super.setNome(nome);
	}
	
	@Override
	double getBonificacao() {
		return super.getSalario() + (super.getSalario()*10/100);
	}
	@Override
	public boolean autentica(int senha) {
		System.out.println("Autenticou " + getNome());
		return false;
	}
	
	

}
