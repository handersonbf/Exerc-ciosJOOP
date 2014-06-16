package correcoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EscreverNoArquivo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("cursos.txt", true);
		
		Scanner entradaTeclado = new Scanner(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.newLine();
		bw.write(entradaTeclado.nextLine());
		
		bw.close();
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
