package exceptions;

public class UncheckedReferenciaNula {
	public static void main(String args[]) {
		Funcionario f = null;
		System.out.println("Bonificação:" + f.getBonificacao());
	}
}
