package correcoes;

public class ModeloSamsumgTV implements ControleRemoto{

	private TV tv;
	public ModeloSamsumgTV() {
		tv = new TV("Samsung", 40);
	}

	@Override
	public void volume(int volume) {
		tv.setVolume(volume);
	}

	@Override
	public void mudarCanal(int canal) {
		tv.setCanal(canal);
	}

	@Override
	public void ligar() {
		tv.setLigada(true);
	}

	@Override
	public void desligar() {
		tv.setLigada(false);
	}

	@Override
	public void status() {
		String mensagem = "OFFLINE";
		if(tv.isLigada()){
			mensagem = "TVON";
		}
		System.out.println(tv.getMarca() + " - " + mensagem);
	}
	
}
