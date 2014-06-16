package correcoes;

public class Apartamento extends Imovel {

	public double getAluguel() {
		return super.getAluguel() + condominio();
	}
	
	private double condominio() {
		return super.getAluguel() * 15 / 100;
	}
	
}
