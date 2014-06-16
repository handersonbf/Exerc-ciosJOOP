package cap14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LendoDoTeclado {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;//é um InputStream
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String textoTeclado = br.readLine();//precisamos ler a primeira linha
		
		while(textoTeclado != null){
			System.out.println(textoTeclado);
			textoTeclado = br.readLine();
		}
	}

}
