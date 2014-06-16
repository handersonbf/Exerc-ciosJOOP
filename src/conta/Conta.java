package conta;

public class Conta implements Comparable<Conta>{

	private double saldo;
	private int numero;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + "]";
	}

	public int compareTo(Conta outra) {
		return this.getNumero() - outra.getNumero();
	}

}







