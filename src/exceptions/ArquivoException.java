package exceptions;

import java.io.FileNotFoundException;

public class ArquivoException {

	public static void main(String[] args) throws FileNotFoundException {
		new java.io.FileInputStream("listaDeAmigas.txt");
	}
}






