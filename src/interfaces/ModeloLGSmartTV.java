package interfaces;

public class ModeloLGSmartTV extends TV implements ControleRemoto{
	

	public ModeloLGSmartTV() {
		super("LG", 42);
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
		System.out.println("Ligando sua TV LG...");
	}

	@Override
	public void desligar() {
		setLigada(false);
		System.out.println("Tchau e volte sempre!");
	}

	@Override
	public void status() {
		String mensagem = "Sua TV está desligada!";
		if(isLigada()){
			mensagem = "Sua TV está ligada";
		}
		System.out.println(getMarca() + " - " + mensagem);
		System.out.println("Canal: " + getCanal());
		System.out.println("Canal: " + getVolume());
	}

}
