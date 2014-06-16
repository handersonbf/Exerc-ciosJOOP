package correcoes;

public class ModeloLGSmartTV implements ControleRemoto{

	private TV tv;
	public ModeloLGSmartTV(){
		tv = new TV("SmartTVLG", 42);
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
		System.out.println("Ligando sua TV LG...");
	}

	@Override
	public void desligar() {
		tv.setLigada(false);
		System.out.println("Tchau e volte sempre!");
	}

	@Override
	public void status() {
		String mensagem = "Sua TV está desligada!";
		if(tv.isLigada()){
			mensagem = "Sua TV está ligada";
		}
		System.out.println(tv.getMarca() + " - " + mensagem);
		System.out.println("Canal: " + tv.getCanal());
		System.out.println("Canal: " + tv.getVolume());
	}
}
