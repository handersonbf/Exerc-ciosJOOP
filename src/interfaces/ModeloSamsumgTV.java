package interfaces;

public class ModeloSamsumgTV extends TV implements ControleRemoto{
	
	public ModeloSamsumgTV() {
		super("Samsumg", 40);
	}

	@Override
	public void volume(int volume) {
		setVolume(volume);
	}

	@Override
	public void mudarCanal(int canal) {
		setCanal(canal);
	}

	@Override
	public void ligar() {
		setLigada(true);
	}

	@Override
	public void desligar() {
		setLigada(false);
	}

	@Override
	public void status() {
		String mensagem = "OFFLINE";
		if(isLigada()){
			mensagem = "TVON";
		}
		System.out.println(getMarca() + " - " + mensagem);
	}

}
