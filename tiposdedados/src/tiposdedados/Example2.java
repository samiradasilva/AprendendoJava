package tiposdedados;

public class Example2 {

	public static void main(String[] args) {

		int var; //declara vari�vel do tipo int (inteiro)
		double x; // declara vari�vel do tipo double (ponto flutuante)
		
		var =10; // atribui a var o valor 10
		x = 10.0; // atribui a x o valor de 10,0
		
		System.out.println("Original value of var: " + var); 
		System.out.println("Original value of x: " + x);
		System.out.println(); 
		
		var = var /4; // divis�o de n�mero inteiro por 4 - resultar� em componente fracion�rio perdido (2)
		x = x /4; // divis�o de x por 4 - resultar� em componente fracion�rio preservado (2.5)
		
		System.out.println("var after division: " + var); 
		System.out.println("x after division: " + x);
	}

}
