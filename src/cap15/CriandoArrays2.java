package cap15;

import java.util.ArrayList;
import java.util.List;

public class CriandoArrays2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		
		int total = 10000;
		
		for(int i=0; i<total; i++){
			lista.add("String" + i);
		}
		long inicio = System.currentTimeMillis();
		for(String s : lista){
			System.out.println(s);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio; 
		System.out.println("Tempo gasto: " + tempo);
	}

}
