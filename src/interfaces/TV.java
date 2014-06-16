package interfaces;

public abstract class TV {

	private String marca;
	private int polegadas;
	private int canal;
	private int volume;
	private boolean ligada;
	
	public TV(){
	}
	
	public TV(String marca, int polegadas){
		this.marca = marca;
		this.polegadas = polegadas;
	}

	public String getMarca() {
		return marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
}
