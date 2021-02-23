package tiposdedados;

public class NumerosPrimos {

	public static void main(String[] args) {

		int x, y;
		boolean eprimo;

		for (x = 2; x < 100; x++) {
			eprimo = true;

			for (y = 2; y <= x / y; y++)
				if ((x % y) == 0)
					eprimo = false;

			if (eprimo)
				System.out.println(x + " é primo.");

		}
	}

}
