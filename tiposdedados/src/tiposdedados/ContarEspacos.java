package tiposdedados;

import java.io.IOException;

public class ContarEspacos {

	public static void main(String[] args) throws IOException {

		char ch;
		int espacos = 0;

		System.out.println("Insira um per�odo para parar.");

		do {
			ch = (char) System.in.read();
			if (ch == ' ')
				espacos++;
		} while (ch != '.');
		System.out.println("Espa�os: " + espacos);

	}
}
