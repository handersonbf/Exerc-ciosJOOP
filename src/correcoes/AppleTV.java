package correcoes;

public class AppleTV implements ControleRemoto{

	private int canal;
	private int volume;
	private boolean ligada;

	@Override
	public void volume(int volume) {
		this.volume = volume;
	}

	@Override
	public void mudarCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public void ligar() {
		this.ligada = true;
	}

	@Override
	public void desligar() {
		this.ligada = false;
	}

	@Override
	public void status() {
		String mensagem = "Sua Apple TV está desligada!";
		if(this.ligada){
			mensagem = "Sua Apple TV está ligada, seja bem vindo!";
		}
		System.out.println(mensagem);
	}
}
