package interfaceOpcionais;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Documento documento;
	
	public Pessoa(String nome, Integer idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setDocumento(Documento ocumento){
		this.documento = ocumento;
	}
	
	public Documento getDocumento(){
		return this.documento;
	}
}
