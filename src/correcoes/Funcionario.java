package correcoes;

abstract class Funcionario {
	
	private double salario;
	private String rg;
	private String nome;
	private int senha;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	Funcionario(){
	}
	
	Funcionario(String nome){
		this.nome = nome;
	}
	
	void bonifica(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void exibirSalario(){
		System.out.println("salario atual: " + this.salario);
	}
	
	void exibirGanhoAnual(){
		System.out.println("ganho anual: " + this.calculaGanhoAnual());
	}
	
//	void mostra(){
//		System.out.println("Nome: " + this.nome);
//		System.out.println("Salario: " + this.salario);
//	}
	
	abstract double getBonificacao();

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Salário: R$ " + this.salario;
	}

	
	
}
