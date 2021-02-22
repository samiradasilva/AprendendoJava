package tiposdedados;

public class CalcCom { // calcula o comprimento da hipotenusa de 2 lados opostos

	public static void main(String[] args) {

		double x, y, z; // declaração das variáveis

		x = 3; // valor lado 1
		y = 4; // valor lado 2

		z = Math.sqrt(x * x + y * y); // expressão pra descobrir valor de z

		System.out.println("Hipotenusa é " + z); // instrução pra saída de dados no console

	}

}
