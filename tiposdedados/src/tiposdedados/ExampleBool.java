package tiposdedados;

public class ExampleBool { // programa que demonstra valores booleanos

	public static void main(String[] args) {

		boolean b; // variavel do tipo boolean

		b = false; // express�o se for um valor falso
		System.out.println("b is " + b);

		b = true; // express�o se for um valor verdadeiro
		System.out.println("b is " + b);

		if (b)
			System.out.println("This is executed."); // sa�da console se for true

		b = false;
		if (b)
			System.out.println("This is not executed."); // sa�da console se for false

		System.out.println("10 > 9 is " + (10 > 9)); // instru��o para a sa�da de dados no console

		
		// Neste caso, a express�o � verdadeira pois 10 � maior que 9.
	}

}
