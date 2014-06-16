package correcoes;

public class TestaAutentica {

	public static void main(String[] args) {
		Autenticavel diretor = new Diretor("Guilherme Frota");
		Autenticavel gerente = new Diretor("Nahan Frota");
		Autenticavel auxiliar = new Diretor("William Frota");
		IntranetBanco intranet = new IntranetBanco();
		
		intranet.login(diretor);
		intranet.login(gerente);
		intranet.login(auxiliar);
	}

}
