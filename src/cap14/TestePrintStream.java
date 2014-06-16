package cap14;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("saidaLeitura.txt");
		while (s.hasNextLine()) {
			ps.println(s.nextLine());
		}
	}
}
