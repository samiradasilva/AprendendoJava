package instrucaocontrole;

import java.io.IOException;

public class Keyboard {

	public static void main(String[] args) throws IOException {

		char ch;
		System.out.print("Press a key followed by ENTER: S");

		ch = (char) System.in.read();

		System.out.println("Your key is: " + ch);
	}

}
