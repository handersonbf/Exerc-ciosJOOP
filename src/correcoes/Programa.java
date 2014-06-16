package correcoes;

public class Programa implements Runnable{

	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	public void run() {
		for(int i = 0; i< 10; i++){
			System.out.println("Rodando " + id + " valor: " + i);
		}
	}
	
}
