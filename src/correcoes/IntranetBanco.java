package correcoes;

public class IntranetBanco {

	void login(Autenticavel autenticavel){
		//pega a senha de algum lugar (banco etc)
		int senha = 0;
		autenticavel.autentica(senha);
	}
}
