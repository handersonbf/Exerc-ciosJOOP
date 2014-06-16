package cap15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CriandoArrays {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		int total = 10000;
		
		for(int i=0; i<total; i++){
			lista.add("String" + i);
		}
		
		long inicio = System.currentTimeMillis();
		for(int i=0; i<total; i++){
			System.out.println(lista.get(i));
		}
		
		System.out.println(lista.size());
		int count = 0;
		for(int i=0; i<lista.size(); i++){
			if(count == 2){
				lista.remove(i);
				count=0;
			}
			count++;
		}
		System.out.println(lista.size());
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio; 
		System.out.println("Tempo gasto: " + tempo);
	}

}
