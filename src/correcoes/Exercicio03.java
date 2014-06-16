package correcoes;

public class Exercicio03 {

	public static void main(String[] args) {
		int contador = 0;
		for(int i=0;i<=100;i++){
			if((i > 10 && i<=50) && (i % 2 == 1)){
				contador++;
			}
		}
		System.out.println(contador);
	}

}
