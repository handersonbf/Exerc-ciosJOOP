package interfaceOpcionais;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class PessoaFisica {

	private Pessoa pessoa;
	
	public PessoaFisica(){
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
		System.out.println("CPF: " + pessoa.getDocumento().getDocumentoComMascara());
		System.out.println("Pessoa: " + pessoa.getNome());
	}

}
