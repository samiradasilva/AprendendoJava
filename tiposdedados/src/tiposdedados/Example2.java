package tiposdedados;

public class Example2 {

	public static void main(String[] args) {

		int var; //declara variável do tipo int (inteiro)
		double x; // declara variável do tipo double (ponto flutuante)
		
		var =10; // atribui a var o valor 10
		x = 10.0; // atribui a x o valor de 10,0
		
		System.out.println("Original value of var: " + var); 
		System.out.println("Original value of x: " + x);
		System.out.println(); 
		
		var = var /4;
		x = x /4;
		System.out.println("var after division: " + var); 
		System.out.println("x after division: " + x);
	}

}
