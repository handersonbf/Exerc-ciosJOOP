package correcoes;

public class ComissaoCorretor {

	private double totalDeComissao;
	
	public void registraComissao(Imovel imovel) {
		totalDeComissao += imovel.getAluguel() * 5 / 100;
	}
	
	public double getTotalDeComissao(){
		return this.totalDeComissao;
	}
	
}
