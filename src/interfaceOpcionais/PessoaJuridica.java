package interfaceOpcionais;

import java.text.ParseException;


public class PessoaJuridica {

	private Pessoa pessoa;
	
	public PessoaJuridica(){
		pessoa = new Pessoa("", 0);
	}
	
	public void setNome(String nome){
		pessoa.setNome(nome);
	}
	
	public String getNome(){
		return pessoa.getNome();
	}
	
	public void setIdade(Integer idade){
		pessoa.setIdade(idade);
	}
	
	public Integer getIdade(){
		return pessoa.getIdade();
	}

	public void setDocumento(Documento documento) {
		pessoa.setDocumento(documento);
	}

	public Documento getDocumento() {
		return pessoa.getDocumento();
	}
	
	public void imprimirDadosPessoa() throws ParseException{
		System.out.println("CNPJ: " + pessoa.getDocumento().getDocumentoComMascara());
		System.out.println("Empresa: " + pessoa.getNome());
	}
	
}
