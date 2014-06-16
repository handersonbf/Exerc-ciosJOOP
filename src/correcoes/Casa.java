package correcoes;

public class Casa extends Imovel {

	public double getAluguel() {
		return super.getAluguel() + 300;
	}

	public double getIptu() {
		return super.getIptu() + 400;
	}
	
}
