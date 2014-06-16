package correcoes;

public class Contador implements Runnable {

	private String nome;
	private int numeroContagem;

	public Contador(String nome, int numeroContagem) {
		this.nome = nome;
		this.numeroContagem = numeroContagem;
	}

	public Contador(String nome) {
		this(nome, 5);
	}

	@Override
	public void run() {
		for (int i = 1; i <= numeroContagem; i++) {
			try {
				Thread.sleep((int) (Math.random() * 5000));
			} catch (InterruptedException e) {
				System.out.println(nome + " parou de contar.");
			}
			System.out.println(nome + " contou até " + i);
		}
		System.out.println("Terminou: " + nome + " terminou de contar até "
				+ numeroContagem);

	}

}
