package correcoes;

public class Imovel {
	
	private String localizacao;
	private double valor;
	private double iptu;
	private double aluguel;
	
	public String getLocalizacao() {
		return localizacao;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getIptu() {
		return this.valor * 10 / 100;
	}
	public double getAluguel() {
		return this.valor * 40 / 100;
	}

}
