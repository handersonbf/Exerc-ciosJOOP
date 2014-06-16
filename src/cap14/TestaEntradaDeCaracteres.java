package cap14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaDeCaracteres {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("SRC/arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String textoDoArquivo = br.readLine();//precisamos ler a primeira linha
		
		while(textoDoArquivo != null){
			System.out.println(textoDoArquivo);
			textoDoArquivo = br.readLine();
		}
		//lembrar sempre de fechar
		br.close();
	}

}
