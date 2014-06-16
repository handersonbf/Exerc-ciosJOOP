package correcoes;

import java.util.ArrayList;
import java.util.List;

public class CriandoArrays {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		int total = 10000;
		
		for(int i=0; i<total; i++){
			lista.add("String" + i);
		}
		
		for(String s : lista){
			System.out.println(s);
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
	}

}
