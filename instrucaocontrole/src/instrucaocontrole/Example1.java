package instrucaocontrole;

public class Example1 {

	public static void main(String[] args) {

		int a, b, c;

		a = 2;
		b = 3;

		if (a < b)
			System.out.println("a é menor que b");

		if (a == b)
			System.out.println("");

		System.out.println();

		c = a - b;

		System.out.println("c contém -1");
		if (c >= 0)
			System.out.println("c não é negativo");

		if (c < 0)
			System.out.println("c é negativo");

		System.out.println();

		c = b - a;

		System.out.println("c contém 1");
		if (c >= 0)
			System.out.println("c não é negativo");
		if (c < 0)
			System.out.println("c é negativo");
	}

}
