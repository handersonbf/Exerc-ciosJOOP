package interfaceOpcionais;

import java.text.ParseException;

public class GerenciaTiposPessoas {

	Documento[] pessoas = new Documento[100];
	
	public void adicionaPessoas(Documento pessoa){
		for(int i =0;i <= pessoas.length;i++){
			if(pessoas[i] == null){
				pessoas[i] = pessoa;
				break;
			}
		}
	}

	public void imprimeDocumentosPessoas() throws ParseException {
		for(Documento d : pessoas){
			if(d != null){
				System.out.println(d.getDocumentoComMascara());
			}
		}
		
	}
}
