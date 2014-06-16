package correcoes;

public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];

	void adiciona(Funcionario f){
		for(int x=0;x < funcionarios.length;x++){
			if(funcionarios[x] == null){
				funcionarios[x] = f;
				break;
			}
		}
	}
	
	void mostrarFuncionarios(){
		System.out.println("Funcionários da Empresa:");
		for (Funcionario funcionario : funcionarios) {
			if(funcionario != null){
				System.out.println(funcionario);
			}
		}
	}
}
