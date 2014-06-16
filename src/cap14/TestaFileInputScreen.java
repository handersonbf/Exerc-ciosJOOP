package cap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestaFileInputScreen {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("SRC/arquivo.txt");
		int  a = is.read();
	}

}
