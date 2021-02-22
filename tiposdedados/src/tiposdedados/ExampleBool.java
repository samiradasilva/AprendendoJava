package tiposdedados;

public class ExampleBool { // programa que demonstra valores booleanos

	public static void main(String[] args) {

		boolean b; // variavel do tipo boolean

		b = false; // expressão se for um valor falso
		System.out.println("b is " + b);

		b = true; // expressão se for um valor verdadeiro
		System.out.println("b is " + b);

		if (b)
			System.out.println("This is executed."); // saída console se for true

		b = false;
		if (b)
			System.out.println("This is not executed."); // saída console se for false

		System.out.println("10 > 9 is " + (10 > 9)); // instrução para a saída de dados no console

		
		// Neste caso, a expressão é verdadeira pois 10 é maior que 9.
	}

}
