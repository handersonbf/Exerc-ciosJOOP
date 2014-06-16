package correcoes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivosAcentuados {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("cursos.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String textoDoArquivo =  br.readLine();
		
		while (textoDoArquivo != null) {
			System.out.println(textoDoArquivo);
			textoDoArquivo = br.readLine();
		}
		
		br.close();
	}

}
