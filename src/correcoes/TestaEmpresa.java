package correcoes;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Handerson Frota");
//		f1.setSalario(1000);
//		empresa.adiciona(f1);
//		
//		Funcionario f2 = new Funcionario();
//		f2.setNome("Rafael Ponte");
//		f2.setSalario(1000);
//		empresa.adiciona(f2);
//		
//		for(int x = 0; x < 5; x++){
//			Funcionario funcionario = new Funcionario();
//			funcionario.setNome("Funcionario 0" + x);
//			funcionario.setSalario(100 + x * 10);
//			empresa.adiciona(funcionario);
//		}
		
//		Funcionario[] funcionarios = empresa.funcionarios;
//		System.out.println("Funcionários da Empresa:");
		//for tradicional
//		for (int i = 0; i < funcionarios.length; i++){
//			if(funcionarios[i] != null){
//				System.out.println("Nome: " + funcionarios[i].nome);
//				System.out.println("Salario: " + funcionarios[i].salario);
//			}
//		}
		
		empresa.mostrarFuncionarios();
		
	}

}
