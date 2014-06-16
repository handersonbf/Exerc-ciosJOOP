package cap16;

public class Programa implements Runnable{

	private int id;		   

	public void run () {
		for (int i = 0; i < 100; i++) {
		    System.out.println("Rodando..." + id + " valor: " + i);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
