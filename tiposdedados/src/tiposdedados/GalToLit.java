package tiposdedados;

//programa para converter galões em litros

public class GalToLit {

	public static void main(String[] args) {

		double gallons; // variável do tipo double contendo o núnero de galões
		double liters; // variável do tipo double que contém a conversão para litros

		gallons = 10; // representa 10 galões
		liters = gallons * 3.7854; // representa a conversão para litros

		System.out.println(gallons + " gallons is " + liters + " liters."); // instrução para a saída de dados no console

	}

}
