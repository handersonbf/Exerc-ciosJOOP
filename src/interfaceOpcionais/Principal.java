package interfaceOpcionais;

import java.text.ParseException;

public class Principal {

	public static void main(String[] args) throws ParseException {
		PessoaJuridica pj = new PessoaJuridica();
		PessoaFisica pf = new PessoaFisica();
		
		
		pj.setNome("TriadWorks");
		pj.setIdade(7);
		pj.setDocumento(new CNPJ("08478999000187"));
		
		pf.setNome("Handerson Frota");
		pf.setIdade(32);
		pf.setDocumento(new CPF("65322878593"));

		pj.imprimirDadosPessoa();
		pf.imprimirDadosPessoa();
		
	}

}
