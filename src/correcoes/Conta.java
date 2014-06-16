package correcoes;

public class Conta implements Comparable<Conta>{

	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente = new Cliente();

	boolean saca(double valor) throws LisoException{
		if(this.saldo > valor){
			this.saldo = this.saldo - valor;
			return true;
		}
		throw new LisoException("Não foi possível sacar!");
	}
	
	void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	boolean transferePara(Conta destino, double valor) throws LisoException{
		if(this.saca(valor)){
			destino.deposita(valor);
			return true;
		}
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public int compareTo(Conta o) {
		return this.getNumero() - o.getNumero();
	}

	
}
